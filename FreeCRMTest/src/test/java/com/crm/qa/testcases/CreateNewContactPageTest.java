package com.crm.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MainPage;
import com.crm.qa.pages.NewContactPage;

public class CreateNewContactPageTest extends TestBase{
	
	MainPage mainPage;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	NewContactPage newContactPage;
	
	public CreateNewContactPageTest(){
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		mainPage = new MainPage();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		newContactPage = new NewContactPage();
		loginPage = mainPage.redirectToLoginPage();
		homePage = loginPage.login(prop.getProperty("useremail"), prop.getProperty("password"));
		contactsPage = homePage.clickContactsMenuLink("Contacts");
		newContactPage = contactsPage.clickCreateButton();
	}
	
	@Test
	public void validateCreateNewContact() {
		newContactPage.createNewContact("Qwerty", "Test", "test@test.com");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
