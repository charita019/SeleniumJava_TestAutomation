package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class ContactsPage extends TestBase {

	TestUtil testUtil;

	@FindBy(xpath = "//div[contains(@class,'header')]//span[text()='Contacts']")
	WebElement contactsLabel;

	// Not a good solution
//	@FindBy(xpath = "//a[contains(text(),'J S')]/parent::td//preceding-sibling::td//input[@name='id']")
//	WebElement checkBox;
	
	@FindBy(className = "download.icon")
	private WebElement exportButton;
	
	@FindBy(xpath = "//div[@class='ui segment']")
	private WebElement popupText;
	
	@FindBy(xpath = "//div[contains(@class,'ui small')]//button[contains(text(),'OK')]")
	private WebElement acceptButton;
	
	@FindBy(xpath = "//button[text()='Show Filters']")
	private WebElement filterButton;
	
//	@FindBy (xpath = "//button[contains(text(),'Create')]")
//	WebElement createBtn;
	
	NavigationMenu navigationMenu;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
		navigationMenu=new NavigationMenu();
	}
	
	public ContactsPage clickContactPageLink(String name) {
		navigationMenu.NavigationToMenu(name);
		return new ContactsPage();
	}
	
	public boolean PageHeading() {
		return contactsLabel.isDisplayed();
	}
	
	
	public boolean ExportButtonDisplay() {
		return exportButton.isDisplayed();
	}
	
	public String exportButtonText() {
		return exportButton.getText();
	}
	
	public boolean FilterButtonDisplay() {
		return filterButton.isDisplayed();
	}
	
	public void ExportButton() {
		exportButton.click();
	}
	
	public void AcceptButton() {
		acceptButton.click();
	}
	
	public String filterButtonText() {
		return filterButton.getText();
	}
	
	public void FilterButtonClick() {
		filterButton.click();
	}
	
	

//	public void selectContactsByName(String contactName) {
//		WebElement checkbox = driver.findElement(By.xpath(
//				"//a[contains(text(),'" + contactName + "')]/parent::td//preceding-sibling::td//input[@name='id']"));
//		try {
//			checkbox.click();
//		} catch (Exception e) {
//			testUtil.executeUsingJavaScript(driver,checkbox);
//		}
//	}
//	
//	public String contactNameInWebTable(String Name) {
//		WebElement dataname = driver.findElement(By.xpath("//div[@class='ui fitted read-only checkbox']/parent::td//following-sibling::td/a[contains(text(),'"+Name+"')]"));
//		System.out.println(dataname.getText());
//		if(dataname.getText().contains(Name)) {
//			return dataname.getText();
//		}
//		return "Not Found";
//	}
	
//	public boolean createButtonVisibility() {
//		return createBtn.isDisplayed();
//	}
//	
//	public NewContactPage clickCreateButton() {
//		createBtn.click();
//		return new NewContactPage();
//	}

}
