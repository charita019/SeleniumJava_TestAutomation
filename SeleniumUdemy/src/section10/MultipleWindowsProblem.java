package section10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowsProblem {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.ebay.com/");
//		
//		driver.navigate().to("https://www.ebay.com/");
		driver.manage().window().maximize();

		
		driver.get("https://the-internet.herokuapp.com/");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		

		
		
		
		

	}

}
