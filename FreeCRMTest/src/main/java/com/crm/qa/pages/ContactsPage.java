package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class ContactsPage extends TestBase {

	TestUtil testUtil;

	@FindBy(xpath = "//div[@id='dashboard-toolbar']//span[text()='Contactss']")
	WebElement contactsLabel;

	// Not a good solution
//	@FindBy(xpath = "//a[contains(text(),'J S')]/parent::td//preceding-sibling::td//input[@name='id']")
//	WebElement checkBox;
	
	@FindBy (xpath = "//button[contains(text(),'Create')]")
	WebElement createBtn;
	
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
		testUtil = new TestUtil();
	}

	public boolean verifyContactsLabel() {
		return contactsLabel.isDisplayed();
	}

	public void selectContactsByName(String contactName) {
		WebElement checkbox = driver.findElement(By.xpath(
				"//a[contains(text(),'" + contactName + "')]/parent::td//preceding-sibling::td//input[@name='id']"));
		try {
			checkbox.click();
		} catch (Exception e) {
			testUtil.executeUsingJavaScript(driver,checkbox);
		}
	}
	
	public String contactNameInWebTable(String Name) {
		WebElement dataname = driver.findElement(By.xpath("//div[@class='ui fitted read-only checkbox']/parent::td//following-sibling::td/a[contains(text(),'"+Name+"')]"));
		System.out.println(dataname.getText());
		if(dataname.getText().contains(Name)) {
			return dataname.getText();
		}
		return "Not Found";
	}
	
	public boolean createButtonVisibility() {
		return createBtn.isDisplayed();
	}
	
	public NewContactPage clickCreateButton() {
		createBtn.click();
		return new NewContactPage();
	}

}
