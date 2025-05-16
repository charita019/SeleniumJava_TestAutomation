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
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MainPage;

@Listeners(CustomListener.class)
public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	MainPage mainPage;

	private static final Logger logger = LogManager.getLogger(LoginPageTest.class);

	public LoginPageTest() {
		super(); // call TestBase class constructor
	}

	@BeforeMethod
	public void setUp() {
		TestBase.initialization();
		loginPage = new LoginPage();
		mainPage = new MainPage();
		loginPage = mainPage.redirectToLoginPage();
		softAssert = new SoftAssert();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		logger.info("******Start Login Page Title Test*******");
		String title = loginPage.getPageTitle();
		softAssert.assertEquals(title, "Cogmento CRM");
		softAssert.assertAll();
		logger.info("******Login Page Title Test Completed*******");
	}

	@Test(priority = 2)
	public void validateLoginPageUrlTest() {
		logger.info("********* Start Login Page URL Test********");
		String actualurl = loginPage.getPageTitle();
		String expectedurl = "https://ui.cogmento.com/register/";
		softAssert.assertEquals(actualurl, expectedurl, "Url do not match");
		softAssert.assertAll();
		logger.info("********* Login Page URL Test Completed********");
	}

	@Test(priority = 3)
	public void loginTest() {
		logger.info("******Start Login Functionality Test*******");
		homePage = loginPage.login(prop.getProperty("useremail"), prop.getProperty("password"));
		logger.info("******Login Functionality Test Completed*******");
	}

	@AfterMethod
	public void tearDown() {
		logger.info("****** Browser Quit Initiated******");
		TestBase.quit();
		logger.info("***** Browser Quit Completed*********");
	}
}
