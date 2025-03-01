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

public class ContactsPageTest extends TestBase {

	MainPage mainPage;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;

	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		mainPage = new MainPage();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		loginPage = mainPage.redirectToLoginPage();
		homePage = loginPage.login(prop.getProperty("useremail"), prop.getProperty("password"));
		contactsPage = homePage.clickContactsMenuLink("Contacts");

	}

	@Test(priority = 1)
	public void verifyContactsPageLabel() {
		Assert.assertTrue(contactsPage.verifyContactsLabel(), "Contact Label is missing on the page");
	}

	@Test(priority = 2)
	public void selectSingleContactsTest() {

		contactsPage.selectContactsByName("J S");
	}

	@Test (priority = 3)
	public void selectMultipleContactsTest() {

		contactsPage.selectContactsByName("J S");
		contactsPage.selectContactsByName("C S");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
