package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
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
	
	@FindBy (xpath = "//div[@role='listbox']")
	WebElement gearIcon;
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String usernm, String pwd) {
		useremail.clear();
		useremail.sendKeys(usernm);
		password.clear();
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
	
	public boolean isLoginSuccessful() {
		return driver.getTitle().contains("Cogmento CRM");
	}
	
	public LoginPage logout() {
		gearIcon.click();
		
		List<WebElement> menuList = driver.findElements(By.xpath("//a[@role='option']"));
		
		for(WebElement menuOption : menuList) {
			if(menuOption.getText().contains("Log Out")) {
				menuOption.click();
				break;
			}
		}
		return new LoginPage();
	}
}