package section2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Get Method
		driver.get("https://rahulshettyacademy.com/");
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.quit();
		
		

	}

}
