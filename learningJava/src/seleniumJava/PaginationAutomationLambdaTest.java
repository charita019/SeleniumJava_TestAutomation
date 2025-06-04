package seleniumJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PaginationAutomationLambdaTest {

	WebDriver driver;
	Actions actions;
	JavascriptExecutor jse;

	@BeforeClass
	public void setUp() {
		try {

			if (driver == null) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://ecommerce-playground.lambdatest.io/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	@BeforeMethod
	public void CameraPage() {

		WebElement megamenu = driver.findElement(By.xpath("//span[contains(text(),' Mega Menu')]"));
		actions = new Actions(driver);

		actions.moveToElement(megamenu).perform();

		List<WebElement> megaMenuList = driver
				.findElements(By.xpath("//*[starts-with(@id,'entry281')]//descendant::div//li"));
		for (WebElement menu : megaMenuList) {
			if (menu.getText().equals("Headphones")) {
				menu.click();
				break;
			}
		}
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");

	}

	@Test (priority = 1)
	public void paginationNumber() {
		//Scenario ; test the pagination at end of page contains "5 pages"
		String actualVal = "";
		String paginationDetails = driver.findElement(By.cssSelector(".col-sm-6.text-right")).getText();
		String[] splitarr = paginationDetails.split("\\(");
		for(String s : splitarr) {
			if(s.contains("5 Pages")) {
				actualVal = actualVal + s;
				break;
			}
		}
		if(actualVal.endsWith(")")) {
			actualVal = actualVal.substring(0, actualVal.length()-1);
		}
		Assert.assertEquals(actualVal, "5 Pages");
	}

	@Test(priority = 2)
	public void getProductDetails() {
		try {
		boolean isNavigationPanelDisplayed = driver.findElement(By.cssSelector("ul.pagination")).isDisplayed();
		boolean isNextButtonDisplayed = driver.findElement(By.linkText(">")).isDisplayed();
		while (isNavigationPanelDisplayed) {
			List<WebElement> productNames = driver.findElements(By.xpath("//div[@class='caption']//a"));
			for (WebElement productName : productNames) {
				String name = productName.getText();
				System.out.println(name);
			}
			
			if (isNextButtonDisplayed) {
				driver.findElement(By.linkText(">")).click();
			} else {
				break;
			}
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		driver = null;
	}
}
