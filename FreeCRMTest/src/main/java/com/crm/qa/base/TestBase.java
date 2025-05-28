package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.crm.qa.listeners.EventListener;
import com.crm.qa.util.TestUtil;

public class TestBase {

	protected static WebDriver driver = null;
	protected static Properties prop;
	protected SoftAssert softAssert;

	protected static final Logger logger = LogManager.getLogger(TestBase.class);

	// constructor
	protected TestBase() {
		try {
			/*
			 * Loading the properties file in the constructor Test classes will call this
			 * constructor
			 */
			prop = new Properties();
			FileInputStream inputstream = new FileInputStream(
					"E:\\Charita\\Study\\GitSelenium\\Selenium\\SeleniumJava_TestAutomation\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(inputstream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected static void initialization() {
		/*
		 * Reading browser from properties file setting the browser depending on the
		 * value fetched from prop file browser driver set;
		 */
		try {
			String browserName = prop.getProperty("browser");
			WebDriver baseDriver = null;
			if (driver == null) {
				if (browserName.equals("chrome")) {
					baseDriver = new ChromeDriver();
				} else if (browserName.equals("edge")) {
					baseDriver = new EdgeDriver();
				}

				logger.info("Logger Initialized");
				EventListener eventListener = new EventListener();
				driver = new EventFiringDecorator<>(eventListener).decorate(baseDriver);
			}

			// Common browser functions - maximize and wait
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));

			// Launch the application url
			driver.get(prop.getProperty("url"));
		} catch (Exception e) {
			Assert.fail("Unexpected Error Occurred" + e.getMessage());
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	protected static void quit() { // closes all browsers + sets session id to null
		driver.quit();
		driver = null;
	}
}
