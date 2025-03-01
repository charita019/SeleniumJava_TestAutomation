package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MainPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	MainPage mainPage;
	ContactsPage contactsPage;
	TestUtil testUtil;
	
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		mainPage = new MainPage();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		loginPage = mainPage.redirectToLoginPage();
		homePage = loginPage.login(prop.getProperty("useremail"), prop.getProperty("password"));
	}
	
	@Test (priority = 1)
	public void verifyHomePageTitleTest() {
		testUtil.waitForPageLoad();
		String homePageTitle = homePage.HomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM", "Home Page Title not matched");
	}
	
	@Test (priority = 2)
	public void verifyLoggedInUserNameTest() {
		Assert.assertTrue(homePage.LoggedInUserName());
		String username = homePage.getLoggedInUserName();
		Assert.assertEquals(username,"Charita Sharma","Logged in User name does not match");
	}
	
	@Test (priority = 3)
	public void verifyContactsLinkTest() {
		contactsPage = homePage.clickContactsMenuLink("Contacts");
	}
	
	@Test (priority = 4)
	public void verifyAddIconClick() {
		contactsPage= homePage.clickAddIcon("Contacts");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
