package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MainPage;
import com.crm.qa.pages.NewContactPage;
import com.crm.qa.util.ExcelDataProvider;
import com.crm.qa.util.TestUtil;
import com.crm.qa.util.TestUtil.waitEnum;

public class CreateNewContactPageTest extends TestBase {

	MainPage mainPage;
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	NewContactPage newContactPage;
	TestUtil testUtil;

	public CreateNewContactPageTest() {
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
		testUtil = new TestUtil();
		homePage = loginPage.login(prop.getProperty("useremail"), prop.getProperty("password"));
		contactsPage = homePage.clickContactsMenuLink("Contacts");
		newContactPage = contactsPage.clickCreateButton();
	}

	
	@Test(dataProvider = "excelData", dataProviderClass = ExcelDataProvider.class/*, retryAnalyzer = com.crm.qa.listeners.RetryAnalyzer.class*/)
	public void verifyCreateNewContact(String firstName, String lastName, String emailAddress) {
		System.out
				.println("First Name - " + firstName + " Last Name - " + lastName + "Email Address - " + emailAddress);
		newContactPage.createNewContact(firstName, lastName, emailAddress);
		testUtil.explicitWaitFor(waitEnum.waitForIcon);
		driver.navigate().back();
	}
	
	//String contactName = contactsPage.contactNameInWebTable(firstName);
	//Assert.assertEquals(contactName, firstName, "Contact not found in the list!");

	@AfterMethod 
	public void tearDown() {
		driver.quit();
	}

}
