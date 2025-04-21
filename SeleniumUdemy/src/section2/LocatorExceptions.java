package section2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorExceptions {

	public static void main(String[] args) throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		//id provided is incorrect - NoSuchElementException
		//driver.findElement(By.id("user-names")).sendKeys("standard_user");
		
		//provide locator as cssSelector and give xpath value to the locator
		//InvalidSelectorException - Invalid or illegal selector 
		//driver.findElement(By.cssSelector("//input[@id='user-name']")).sendKeys("standard_user");
		
		//NoSuchElementException - provide id value in cssSelector
		//driver.findElement(By.cssSelector("user-name")).sendKeys("standard_user");
		
		URL url = new URL("https://practicetestautomation.com/practice-test-exceptions/");
		driver.navigate().to(url);
		
		driver.findElement(By.name("Add")).click();
		
		driver.findElement(By.className("input-field")).isDisplayed();
		//Element not interactable exception - Row 2 took time to load
		driver.findElement(By.className("input-field")).sendKeys("Burger");
		
		
		
		
		
		
	}

}
