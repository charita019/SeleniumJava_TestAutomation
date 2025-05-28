package com.crm.qa.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.qa.base.TestBase;
import com.crm.qa.listeners.CustomListener;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MainPage;
import com.crm.qa.util.TestUtil;

@Listeners(CustomListener.class)
public class MainPageTest extends TestBase {

	/*
	 * Actual test cases - using TestNG annotations
	 */
	MainPage mainPage; // object ref of the page class.
	LoginPage loginPage;
	TestUtil testUtil;

	private static final Logger logger = LogManager.getLogger(MainPageTest.class);

	public MainPageTest() {
		super(); // call test base class constructor
	}

	@BeforeMethod
	public void setUp() {
		/*
		 * for every test to execute, we need to launch browser and call the application
		 * url So in setUp method calling base class initialization method which will
		 * load the browser and launch thw application url
		 */
		TestBase.initialization();
		mainPage = new MainPage(); // to call the methods of the page class by creating object of the page class
		softAssert = new SoftAssert();
	}

	@Test(priority = 1)
	public void validatePageTitle() {
		logger.info("******Starting Main Page Title Test*******");
		String mainPageTitle = mainPage.getPageTitle();
		softAssert.assertEquals(mainPageTitle, "#1 Free CRM Software Power Up your Entire Business Free Forever",
				"Title Mismatch!!");
		softAssert.assertAll();
		logger.info("******MAIN Page Title Test is completed*****");
	}
	
	@Test(priority = 2)
	public void MainPageUrlTest() {
		logger.info("********Starting Main Page Url Test***********");
		String actualurl = mainPage.getPageUrl();
		String expectedurl = "https://www.freecrm.com/";
		softAssert.assertEquals(actualurl, expectedurl, "URL do not match");
		softAssert.assertAll();
		logger.info("********Main Page Url Test Completed***********");
	}

	@Test(priority = 3)
	public void loginLinkClickTest() {
		logger.info("******Starting Start Here Click Test on Main Page********");
		loginPage = mainPage.redirectToLoginPage();
		logger.info("****Start Here click test is completed******");
	}

	@AfterMethod
	public void tearDown() {
		logger.info("***Starting Browser Quit***");
		TestBase.quit();
		logger.info("***Browser Quit completed successfully****");	
	}
}
