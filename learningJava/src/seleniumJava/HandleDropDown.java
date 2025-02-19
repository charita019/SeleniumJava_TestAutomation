package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		
		//1. Alerts - javascript
		//2. File upload
		//3. Browser Window / ads popup	
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");

		WebElement dropdown=driver.findElement(By.id("select-menu"));
		//to handle dropdown - use Select Class - pass the element to which to perform action
		Select select = new Select(dropdown);
		select.selectByVisibleText("0-1");
	}

}
