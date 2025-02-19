package seleniumJava;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		try {
			Properties prop =  new Properties();
			FileInputStream fp=new FileInputStream("E:\\Charita\\Study\\Selenium\\SeleniumJava\\learningJava\\src\\seleniumJava\\config.properties");
			
			prop.load(fp);
			
			String demourl=prop.getProperty("demoappurl");
			String browsernm=prop.getProperty("browser");
			
			if(browsernm.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", prop.getProperty("brwsrdriver"));
				driver=new HtmlUnitDriver(); //launch test in headless mode using htmlunitdriver
				//driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			}
			else if(browsernm.equals("Edge")) {
				System.setProperty("webdriver.edge.driver", prop.getProperty("edgebrwsrdriver"));
				driver=new HtmlUnitDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			}
			else {
				System.out.println("Not a valid browser");
			}
			
			driver.get(demourl);
			System.out.println("Page Title on Application Load : " + driver.getTitle());
			System.out.println("Page Url on Application Load : " + driver.getCurrentUrl());
			
			driver.findElement(By.id(prop.getProperty("skipsignin_id"))).click();
			System.out.println("Page Title after button clicked : " + driver.getTitle());
			System.out.println("Page Url after button clicked : " + driver.getCurrentUrl());
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
