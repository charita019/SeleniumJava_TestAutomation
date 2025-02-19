package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsAssignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Get Application Url
		driver.get("https://demo.automationtesting.in/Register.html");

		// First Name and last Name
		driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys("User");

		// Address
		driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("12th Avenue, Manhattan");

		// Input Email Address
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("tuser@test.com");

		// Input PhoneNumber
		driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("1234567890");

		// Select Gender Radio Button
		driver.findElement(By.xpath("//*[@value='FeMale']")).click();

		// Select Hobbies Check-box
		driver.findElement(By.id("checkbox2")).click();

		// Skills Field
		WebElement skills = driver.findElement(By.id("Skills"));
		Select skillselect = new Select(skills);
		skillselect.selectByVisibleText("Java");

		// select year in dob
		WebElement yr = driver.findElement(By.cssSelector("#yearbox"));
		Select yrselect = new Select(yr);
		yrselect.selectByValue("1994");
		WebElement mnth = driver.findElement(By.xpath("//*[@ng-model='monthbox']"));
		Select mnthselect = new Select(mnth);
		mnthselect.selectByVisibleText("July");
		WebElement day = driver.findElement(By.cssSelector("#daybox"));
		Select dayselect = new Select(day);
		dayselect.selectByIndex(15);

		// Password
		driver.findElement(By.id("firstpassword")).sendKeys("TestUserPass");

		// Confirm Password
		driver.findElement(By.cssSelector("#secondpassword")).sendKeys("TestUserPass");
		
		//Submit
		driver.findElement(By.name("signup")).click();
	}

}
