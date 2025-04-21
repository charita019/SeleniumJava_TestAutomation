package section10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InputTextWays {

	@Test
	public void inputways() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		//3. Using chrome options
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--window-size=1280,800");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice-automation.com/form-fields/");
		
		// 1. set the window to full size
		driver.manage().window().maximize();
		
		// 2. To a specific size
		//driver.manage().window().setSize(new Dimension(1000,2000));
		
		//4. fullscreen mode
		//driver.manage().window().fullscreen();
		

		WebElement nameinput = driver.findElement(By.id("name-input"));
		// 1. Using Sendkeys
		nameinput.sendKeys("tom");

		// 2. Using Actions class
		Actions action = new Actions(driver);
		action.sendKeys(nameinput, "Jerry").build().perform();

		// 3. Javascript Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Spike';", nameinput);
		
		WebElement automationdropdown = driver.findElement(By.id("automation"));
		//js.executeScript("arguments[0].scrollIntoView();",automationdropdown);
		
		
		action.moveToElement(automationdropdown).perform();
	}
}
