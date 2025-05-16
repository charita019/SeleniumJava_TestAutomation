package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MainPage extends TestBase {

	/*
	 * POM + Page Factory Use Locators - @FindBy annotation >> use - locators define
	 */
	@FindBy(xpath = "//span[contains(text(),'Start')]")
	private WebElement startHereLink;

	@FindBy(linkText = "Sign Up")
	private WebElement signUpLink;

	// Initialize the Web Elements declared with @FindBy annotation and map with driver
	public MainPage() {
		PageFactory.initElements(driver, this);
	}

	// New page which is Login page - landing page of the Start Here Link click
	public LoginPage redirectToLoginPage() {
		startHereLink.click();
		return new LoginPage(); 
	}
}