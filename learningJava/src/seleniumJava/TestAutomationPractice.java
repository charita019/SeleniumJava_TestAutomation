package seleniumJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAutomationPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.id("name")).sendKeys("Test 12");

		driver.findElement(By.id("email")).sendKeys("test12@gmail.com");

		driver.findElement(By.id("phone")).sendKeys("9549394121");

		driver.findElement(By.id("textarea")).sendKeys("12th Avenue 67");

		driver.findElement(By.id("male")).click();

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']//following-sibling::label"));
		for (WebElement checkbox : checkboxes) {
			if (checkbox.getText().equalsIgnoreCase("Sunday")) {
				checkbox.click();
			}
		}
		
		WebElement countrySelect = driver.findElement(By.id("country"));
		Select select = new Select(countrySelect);
		select.selectByVisibleText("Canada");
		
		

	}

}
