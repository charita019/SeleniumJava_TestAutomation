package com.crm.qa.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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

	private static final Logger logger = LogManager.getLogger(ContactsPageTest.class);

	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		TestBase.initialization();
		mainPage = new MainPage();
		loginPage = mainPage.redirectToLoginPage();
		homePage = loginPage.login(prop.getProperty("user1"), prop.getProperty("pass1"));
		contactsPage = new ContactsPage();
		contactsPage = contactsPage.clickContactPageLink("Contacts");
		softAssert = new SoftAssert();
	}

	@Test(priority = 1)
	public void ContactPageTitleTest() {
		logger.info("******Start Contact Page Title Test******");
		String actualtitle = contactsPage.getPageTitle();
		String expectedtitle = "Cogmento CRM";
		softAssert.assertEquals(actualtitle, expectedtitle);
		softAssert.assertAll();
		logger.info("******Contact Page Title Test Completed******");
	}

	@Test(priority = 2)
	public void ContactPageUrlTest() {
		logger.info("******Start Contact Page Url Test******");
		String actualurl = contactsPage.getPageUrl();
		String expectedurl = "https://ui.cogmento.com/contacts";
		softAssert.assertEquals(actualurl, expectedurl);
		softAssert.assertAll();
		logger.info("******Contact Page Url Test Completed******");
	}

	@Test(priority = 3)
	public void verifyContactsPageLabel() {
		logger.info("******Start Contact Page Heading Label Test******");
		softAssert.assertTrue(contactsPage.PageHeading(), "Page Heading is missing or incorrect");
		softAssert.assertAll();
		logger.info("******Contact Page Heading Label Test Completed******");
	}

	@Test(priority = 4)
	public void exportButtonTest() {
		logger.info("****** Start Contact Page Export Button Test******");
		boolean displayFlag = contactsPage.ExportButtonDisplay();
		softAssert.assertTrue(displayFlag, "Button is not visible");
		String actualText = contactsPage.exportButtonText();
		String expectedText = "Export";
		softAssert.assertEquals(actualText, expectedText, "Button Text Do not Match");
		softAssert.assertAll();
		logger.info("******Contact Page Export Button Test Completed******");
	}

	@Test(priority = 5)
	public void filterButtonTest() {
		logger.info("******Start Contact Page Filter Button Test******");
		boolean filterbtndisplay = contactsPage.FilterButtonDisplay();
		softAssert.assertTrue(filterbtndisplay, "Button is not visible");
		String btnTextBeforeClick = contactsPage.filterButtonText();
		String expected = "Show Filters";
		softAssert.assertEquals(btnTextBeforeClick, expected, "Button Text do not match");
		contactsPage.FilterButtonClick();
		String btnTextAfterClick = contactsPage.filterButtonText();
		String expectedAfterClick = "Hide Filters";
		softAssert.assertEquals(btnTextAfterClick, expectedAfterClick, "Button Text do not match");
		softAssert.assertAll();
		logger.info("******Contact Page Filter Button Test Completed******");
	}

//	@Test(priority = 4, enabled = false)
//	public void ExportButtonTest() {
//		String popupText = contactsPage.ExportButton();
//		if(popupText.contains("OK or Cancel")) {
//			contactsPage.AcceptButton();
//		}	
//	}
//
//	@Test(priority = 4)
//	public void verifyselectSingleContactsTest() {
//
//		contactsPage.selectContactsByName("J S");
//	}
//
//	@Test (priority = 3)
//	public void verifyselectMultipleContactsTest() {
//
//		contactsPage.selectContactsByName("J S");
//		contactsPage.selectContactsByName("C S");
//	}
//	
//	@Test (priority = 4)
//	public void verifyCreateBtnVisibilityTest() {
//		boolean isBtnVisibleflag = contactsPage.createButtonVisibility();
//		Assert.assertTrue(isBtnVisibleflag, "Create Button is not visible");
//	}
//	
//	@Test(priority = 5)
//	public void verifyCreateBtnClickTest() {
//		newContactPage = contactsPage.clickCreateButton();
//	}

	@AfterMethod
	public void tearDown() {
		TestBase.quit();
	}

}
