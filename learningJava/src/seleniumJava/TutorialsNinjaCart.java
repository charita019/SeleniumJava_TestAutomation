package seleniumJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TutorialsNinjaCart {

	WebDriver driver;
	WebDriverWait wait ; 

	@BeforeTest
	public void setUP() {
		try {
			if (driver == null) {
				driver = new ChromeDriver();
				driver.get("https://tutorialsninja.com/demo/");
				driver.manage().window().maximize();
				wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.urlContains("tutorialsninja"));
			}
		} catch (Exception e) {
			Assert.fail("Unexpected error" + e.getMessage());
		}
	}

	@Test
	public void testCartValue() {
		
		String cartValue = driver.findElement(By.id("cart")).getText();
		String[] cart = cartValue.split(" ");
		for(String val : cart) {
			if(Integer.parseInt(val) >=0) {
				break;
			}
			Assert.assertEquals(val, 0);
		}
		
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
		driver = null;
	}

}
