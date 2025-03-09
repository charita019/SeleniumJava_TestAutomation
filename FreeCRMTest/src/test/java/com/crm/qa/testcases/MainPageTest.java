package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.listeners.CustomListener;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MainPage;
import com.crm.qa.util.TestUtil;

@Listeners(CustomListener.class)
public class MainPageTest extends TestBase {
	
	MainPage mainPage;
	LoginPage loginPage;
	TestUtil testUtil;
	
	public MainPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		mainPage = new MainPage();
		testUtil = new TestUtil();
	}
	
	@Test (priority = 1)
	public void mainPageTitleTest() {
		
		String mainpgtitle = mainPage.validateMainPagetitle();
		Assert.assertEquals(mainpgtitle, "Free CRM Software - Customer Relationship Management");
	}
	
	@Test (priority = 2)
	public void loginLinkClickTest() {
		loginPage = mainPage.redirectToLoginPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
