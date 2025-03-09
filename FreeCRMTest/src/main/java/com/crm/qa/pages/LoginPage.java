package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class LoginPage extends TestBase{
	
	MainPage mainPage;
	TestUtil testUtil;
	
	//Objects and Methods of Login Page
	//1. define object repository / page factory
	
	@FindBy(name = "email")
	WebElement useremail;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement loginBtn;
	
	@FindBy (xpath = "//a[text()='Sign Up']")
	WebElement signUp;
	
	@FindBy (xpath = "//a[contains(text(),'Forgot your password?']")
	WebElement forgotPasswordLink;
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
		testUtil = new TestUtil();
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String usernm, String pwd) {
		useremail.sendKeys(usernm);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}
