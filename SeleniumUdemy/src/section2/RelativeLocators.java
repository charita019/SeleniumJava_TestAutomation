package section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/");
		
		WebElement getstarted = driver.findElement(By.id("signupModalProductButton"));
		
		WebElement talkToUs = driver.findElement(RelativeLocator.with(By.tagName("button")).toRightOf(getstarted));
		talkToUs.click();
		

	}

}
