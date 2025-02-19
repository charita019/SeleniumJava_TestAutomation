package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//		driver.get("https://demo.automationtesting.in/Register.html");
//		// Locators 
//		//1. Xpath
//		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Test");
//
//		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("User");
//
//		driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("12,Test Address");
//		//2. id 
//		driver.findElement(By.id("checkbox1")).click();

//		 driver.get("https://demoqa.com/automation-practice-form");
//		 Locators
//		 1. Xpath
		//absolute xpath should not be used
		//use relative xpath 
//		 driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Test");
//		 driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("User");
//		 driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("tuser@test.com");

//       2. id
//		driver.findElement(By.id("firstName")).sendKeys("Test");
//		driver.findElement(By.id("lastName")).sendKeys("User");
//		driver.findElement(By.id("userEmail")).sendKeys("tuser@test.com");

		// 3. name - if name is present
		// driver.findElement(By.name("")).sendKeys(args);

		// 4. linkText - only for links
		// Click on Home Link
//		driver.get("https://demo.automationtesting.in/Register.html");
//		driver.findElement(By.linkText("Home")).click();
		
		//5. Partial Link text - : Only for links and Not recommended to use
//		driver.get("https://formy-project.herokuapp.com/");
//		driver.findElement(By.partialLinkText("Enabled and ")).click();
		
		//6. CSS Selector - #<id value>
		// # for id , class use . 
		driver.get("https://formy-project.herokuapp.com/form");
		driver.findElement(By.cssSelector("#job-title")).sendKeys("Test Engineer");
		
		//7. Class Name - Not recommended to use ; can be duplicate for different elements. 
		driver.findElement(By.className("form-control")).sendKeys("Test");
	}

}
