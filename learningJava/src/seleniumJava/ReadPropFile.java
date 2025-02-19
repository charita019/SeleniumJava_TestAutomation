package seleniumJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		//Create Object of Properties Class
		Properties prop=new Properties();
		
		//Create object of file input stream class.
		//Pass the path of the config.properties to the file input stream.
		//create input stream b/w java code and properties file
		FileInputStream ip=new FileInputStream("E:\\Charita\\Study\\Selenium\\SeleniumJava\\learningJava\\src\\seleniumJava\\config.properties");
		
		//Load the file
		prop.load(ip);
		
		//System.out.println(prop.getProperty("Name")); Name prop is not available in properties file
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		
		String url=prop.getProperty("URL");
		
		System.out.println(url);
		
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"E:\\Charita\\Study\\Selenium\\SeleniumJava\\geckodriver-win64\\geckoedriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(browserName.equals("Edge")) {
			//set property for microsoft edge 
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		else {
			System.out.println("Not a valid browser");
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("login_xpath"))).click();
		

	}

}
