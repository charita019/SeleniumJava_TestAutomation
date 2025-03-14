package section7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdownAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement simpleDropdown = driver.findElement(By.id("dropdown"));
		Select select = new Select(simpleDropdown);
		
		select.selectByVisibleText("Option 2");
		String expectedOutput1 = select.getFirstSelectedOption().getText();
		Assert.assertEquals(expectedOutput1, "Option 2", "Mismatch");
		
		select.selectByIndex(1);
		String expectedOutput2 = select.getFirstSelectedOption().getText();
		Assert.assertEquals(expectedOutput2, "Option 1", "Mismatch");
		
		select.selectByValue("2");
		String expectedOutput3 = select.getFirstSelectedOption().getText();
		Assert.assertEquals(expectedOutput3, "Option 2", "Mismatch");
		
		WebElement elePerPage = driver.findElement(By.id("elementsPerPageSelect"));
		Select select1 = new Select(elePerPage);
		select1.selectByValue("50");
		
		WebElement countrySelect = driver.findElement(By.id("country"));
		Select select2 = new Select(countrySelect);
		select2.selectByValue("IN");
		System.out.println(select2.getFirstSelectedOption().getText());
		
		select2.selectByVisibleText("Macedonia, the Former Yugoslav Republic of");
		System.out.println(select2.getFirstSelectedOption().getText());
		
		//driver.quit();
	}

}
