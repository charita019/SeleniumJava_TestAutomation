package seleniumJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class MouseMovement2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		
		WebElement menu = driver.findElement(By.id("developers-dd-toggle"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).build().perform();
		
		driver.findElement(By.xpath("//div[@class='bstack-mm-sub-li'] //span[text()='Support']")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(Exception.class);
	}

}
