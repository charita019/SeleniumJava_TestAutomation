package com.crm.qa.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MainPage;
import com.crm.qa.pages.NavigationMenu;
import com.crm.qa.util.TestUtil;
import com.crm.qa.util.TestUtil.waitEnum;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	NavigationMenu navigationMenu;
	HomePage homePage;
	MainPage mainPage;
	ContactsPage contactsPage;
	TestUtil testUtil;

	private static final Logger logger = LogManager.getLogger(HomePageTest.class);

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		TestBase.initialization();
		mainPage = new MainPage();
		loginPage = new LoginPage();
		navigationMenu = new NavigationMenu();
		homePage = new HomePage();
		testUtil = new TestUtil();
		loginPage = mainPage.redirectToLoginPage();
		homePage = loginPage.login(prop.getProperty("user1"), prop.getProperty("pass1"));
		homePage = homePage.clickHomePageLink("Home");
	}


	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
		logger.info("******Start Home Page Title Test*******");
		testUtil.explicitWaitFor(waitEnum.waitForUrl);
		String homePageTitle = homePage.getPageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM", "Home Page Title not matched");
		logger.info("******Home Page Title Test Completed*******");
	}

	@Test(priority = 2)
	public void valdiateHomePageUrl() {
		logger.info("******Start Home Page Url Test*******");
		String homeurl = "https://ui.cogmento.com/home";
		String homePageUrl = homePage.getPageUrl();
		Assert.assertEquals(homePageUrl, homeurl, "URL not matched");
		logger.info("******Home Page Url Test Completed*******");
	}

	@Test(priority = 2)
	public void verifyLoggedInUserNameTest() {
		logger.info("******Start LoggedInUserName Test*******");
		String username = homePage.getLoggedInUserName();
		Assert.assertEquals(username, "Charita Sharma", "Logged in User name does not match");
		logger.info("******LoggedInUserName Test Completed*******");
	}

	@AfterTest
	public void tearDown() {
		TestBase.quit();
	}
}
