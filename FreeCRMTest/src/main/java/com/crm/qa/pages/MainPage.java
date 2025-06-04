package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.WaitsUtil;

public class MainPage extends TestBase {

	/*
	 * POM + Page Factory Use Locators - @FindBy annotation >> use - locators define
	 */
	@FindBy(xpath = "//span[contains(text(),'Start')]")
	private WebElement startHereLink;

	@FindBy(linkText = "Sign Up")
	private WebElement signUpLink;
	
	WaitsUtil waitsutil;

	// Initialize the Web Elements declared with @FindBy annotation and map with driver
	public MainPage() {
		PageFactory.initElements(driver, this);
		waitsutil = new WaitsUtil(driver);
	}

	// New page which is Login page - landing page of the Start Here Link click
	public LoginPage redirectToLoginPage() {
		waitsutil.waitForVisibility(startHereLink);
		startHereLink.click();
		return new LoginPage(); 
	}
}