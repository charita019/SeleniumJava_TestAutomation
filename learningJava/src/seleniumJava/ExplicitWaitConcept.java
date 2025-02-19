package seleniumJava;

import java.time.Duration;	

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		driver.get("https://demoqa.com/");
//		
//		List<WebElement> cards=driver.findElements(By.cssSelector(".card-body"));
//		//explicit wait for specific element
//		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
//		w.until(ExpectedConditions.visibilityOfAllElements(cards));
//		driver.findElement(By.xpath("//h5[contains(text(),'Forms')]")).click();
		
		driver.get("https://www.facebook.com/");
		clickOn(driver,driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")),Duration.ofSeconds(20));
		
	}

	public static void clickOn(WebDriver driver, WebElement locator, Duration duration) {
		new WebDriverWait(driver, duration).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}