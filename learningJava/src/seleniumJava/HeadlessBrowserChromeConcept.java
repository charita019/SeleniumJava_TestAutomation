package seleniumJava;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class HeadlessBrowserChromeConcept {

	static WebDriver driver;
	static String ParentWindowId;

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			FileInputStream fp = new FileInputStream(
					"E:\\Charita\\Study\\Selenium\\SeleniumJava\\learningJava\\src\\seleniumJava\\config.properties");

			prop.load(fp);

			String url = prop.getProperty("CRMURL");

			String browsername = prop.getProperty("browser");

			if (browsername.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", prop.getProperty("brwsrdriver"));
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				options.addArguments("--start-maximized");
				driver = new ChromeDriver(options);

				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			} else if (browsername.equals("Edge")) {
				System.setProperty("webdriver.edge.driver", prop.getProperty("brwsrdriver"));
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			} else {
				System.out.println("Not a valid browser");
			}

			driver.get(url);
			System.out.println("Before Login - Current URL is : " + driver.getCurrentUrl());
			System.out.println("Before Login - Page Title is : " + driver.getTitle());

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.findElement(By.linkText(prop.getProperty("loginlink_linktext"))).click();

			Set<String> handles = driver.getWindowHandles();
			Iterator<String> it = handles.iterator();

			ParentWindowId = it.next();
			String ChildWindowId = it.next();

			driver.switchTo().window(ChildWindowId);

			// crm - login page xpaths
			driver.findElement(By.name(prop.getProperty("emaill_name"))).sendKeys(prop.getProperty("email"));
			driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("pass"));
			driver.findElement(By.xpath(prop.getProperty("logincrm_xpath"))).click();

			// saucedemo url - login page xpaths
//			driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("username"));
//			driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
//			driver.findElement(By.xpath(prop.getProperty("login_xpath"))).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println("After Login - Url is : " + driver.getCurrentUrl());
			System.out.println("After login - Page Title is : " + driver.getTitle());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// driver.switchTo().window(ParentWindowId);
		}

	}

}
