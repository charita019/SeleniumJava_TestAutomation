package section2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/"); //returns void
		String pageTitle = driver.getTitle(); //returns String
		System.out.println(pageTitle);
		
		String currUrl = driver.getCurrentUrl();
		System.out.println(currUrl);
		
		driver.close(); //closes the current window
		driver.quit(); //closes all the associated windows opened by the driver
		

	}

}
