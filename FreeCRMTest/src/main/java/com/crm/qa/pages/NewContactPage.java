package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class NewContactPage extends TestBase{
	
	@FindBy (name = "first_name")
	WebElement firstName;
	
	@FindBy (name = "last_name")
	WebElement lastName;
	
	@FindBy (xpath = "//input[contains(@placeholder,'Email address')]")
	WebElement emailAddr;
	
	@FindBy (xpath = "//div[@name='category']")
	List<WebElement> categorySelect;
	
	@FindBy (xpath = "//button[text()='Save']")
	WebElement saveBtn;

	public NewContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void createNewContact(String fname,String lname, String eMail) {
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		emailAddr.sendKeys(eMail);
		
//		for(int i = 0; i<categorySelect.size();i++) {
//			if(categorySelect.get(i).getText().equals(catName)) {
//				categorySelect.get(i).click();
//			}
//		}
		saveBtn.click();
	}
}
