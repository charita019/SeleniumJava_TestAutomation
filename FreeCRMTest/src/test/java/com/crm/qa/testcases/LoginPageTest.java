package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

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

	public LoginPageTest() {
		super(); // call TestBase class constructor
	}

	@BeforeMethod
	public void setUp() {
		TestBase.initialization();
		loginPage = new LoginPage();
		mainPage = new MainPage();
		loginPage = mainPage.redirectToLoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		Reporter.log(title);
	}

	@Test (priority = 2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("useremail"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		TestBase.quit();
	}
}
