package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class MainPage extends TestBase{
	
	TestUtil testUtil;
		
	@FindBy(linkText = "LOGIN")
	WebElement loginLink;
	
	@FindBy(linkText = "Sign Up")
	WebElement signUpLink;
	
	public MainPage() {
		PageFactory.initElements(driver, this);
		testUtil = new TestUtil();
	}
	
	public String validateMainPagetitle() {
		return driver.getTitle();
	}
	
	public LoginPage redirectToLoginPage() {
		loginLink.click();
		testUtil.switchWindow();
		return new LoginPage();
	}

}
