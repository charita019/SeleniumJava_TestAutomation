package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	
	public static WebDriver driver = null;
	 
	//singleton pattern
	public static void initialize() {
		if(driver == null) {
			if(Constants.browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
				
				driver=new ChromeDriver();
			} else if (Constants.browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.chrome.driver",
						"E:\\Charita\\Study\\Selenium\\SeleniumJava\\edgedriver-win64\\edgedriver.exe");
				
				driver=new EdgeDriver();
			}
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(Constants.url);
	}
	
	public static void quit() {
		System.out.println("Browser is Quitting");
		driver.quit();
		driver = null;
	}
	
	public static void close() {
		System.out.println("Browser is Closing");
		driver.close();
		driver = null;
	}
}
