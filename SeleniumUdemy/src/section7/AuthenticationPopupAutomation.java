package section7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class AuthenticationPopupAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://practice.expandtesting.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement basicAuth = driver.findElement(By.xpath("//a[contains(text(),'Basic Authentication')]"));
		js.executeScript("arguments[0].click();", basicAuth);
		
		driver.get("https://admin:admin@practice.expandtesting.com/basic-auth");
		
		String expected = driver.findElement(By.cssSelector("p.alert.alert-success")).getText();
		String actual = "Congratulations! You must have the proper credentials.";
		System.out.println(expected);
		Assert.assertEquals(expected, actual, "text does not match");
	}

}
