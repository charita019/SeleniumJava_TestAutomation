package section7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
			System.out.println("Enabled");
			Assert.assertTrue(false);
		}
		else {
			Assert.assertTrue(true);
		}
		
		

	}

}
