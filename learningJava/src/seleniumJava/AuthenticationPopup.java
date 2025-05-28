package seleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class AuthenticationPopup {

	public static void main(String[] args) {

		try {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			WebDriver driver = new ChromeDriver(options);

			driver.get("https://the-internet.herokuapp.com/");
			driver.manage().window().maximize();

			List<WebElement> contentList = driver.findElements(By.xpath("//div[@id='content']//ul//descendant::li"));
			
			for(WebElement menu : contentList) {
				if(menu.getText().contains("Basic Auth")) {
					menu.click();
					break;
				}
			}
						
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			
			String actual = driver.findElement(By.xpath("//div[@class='example']//p")).getText();
			String expected = "Congratulations! You must have the proper credentials.";
			Assert.assertEquals(actual, expected, "Mismatch");

		} catch (Exception e) {
			System.err.println("Unexpected Error" + e.getMessage());
		}

	}

}
