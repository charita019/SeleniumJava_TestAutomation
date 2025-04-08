package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

import com.crm.qa.listeners.EventListener;
import com.crm.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver = null;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream inputstream = new FileInputStream(
					"E:\\Charita\\Study\\GitSelenium\\SeleniumJava_TestAutomation\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(inputstream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		WebDriver baseDriver = null;
		if (driver == null) {
			if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
				baseDriver = new ChromeDriver();
			} else if (browserName.equals("edge")) {
				System.setProperty("webdriver.edge.driver", "path to edgedriver.exe");
				baseDriver = new EdgeDriver();
			}
		}

		EventListener eventListener = new EventListener();
		driver = new EventFiringDecorator<>(eventListener).decorate(baseDriver);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));

		driver.get(prop.getProperty("url"));
	}
	
	public static void quit() {
		System.out.println("Browser is Quitting");
		driver.quit();
		driver = null;
	}
	
	public static void close() {
		System.out.println("Broswer is closing");
		driver.close();
		driver = null;
	}
}
