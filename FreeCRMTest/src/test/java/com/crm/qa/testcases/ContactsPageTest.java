package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MainPage;
import com.crm.qa.pages.NewContactPage;

public class ContactsPageTest extends TestBase {

	MainPage mainPage;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	NewContactPage newContactPage;

	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		mainPage = new MainPage();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		newContactPage = new NewContactPage();
		loginPage = mainPage.redirectToLoginPage();
		homePage = loginPage.login(prop.getProperty("useremail"), prop.getProperty("password"));
		contactsPage = homePage.clickContactsMenuLink("Contacts");

	}

	@Test(priority = 1)
	public void verifyContactsPageLabel() {
		Assert.assertTrue(contactsPage.verifyContactsLabel(), "Contact Label is missing on the page");
	}

	@Test(priority = 2)
	public void verifyselectSingleContactsTest() {

		contactsPage.selectContactsByName("J S");
	}

	@Test (priority = 3)
	public void verifyselectMultipleContactsTest() {

		contactsPage.selectContactsByName("J S");
		contactsPage.selectContactsByName("C S");
	}
	
	@Test (priority = 4)
	public void verifyCreateBtnVisibilityTest() {
		boolean isBtnVisibleflag = contactsPage.createButtonVisibility();
		Assert.assertTrue(isBtnVisibleflag, "Create Button is not visible");
	}
	
	@Test(priority = 5)
	public void verifyCreateBtnClickTest() {
		newContactPage = contactsPage.clickCreateButton();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
