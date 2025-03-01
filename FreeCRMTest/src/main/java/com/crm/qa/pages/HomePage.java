package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
//	@FindBy(xpath = "//span[contains(text(),'Charita Sharma')]")
	@FindBy(xpath = "//span[contains(@class,'user-display')]")
	WebElement userNameLabel;
	
	@FindBy(id = "main-nav")
	WebElement navmenu;
	
	@FindBy(xpath = "//div[@class='menu-item-wrapper']")
	List<WebElement> navMenuLinks;
	
	@FindBy(tagName = "body")
	WebElement clickOutside;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String HomePageTitle() {
		return driver.getTitle();
	}
	
	public Boolean LoggedInUserName() {
		return userNameLabel.isDisplayed();	
	}
	
	public String getLoggedInUserName() {
		if(userNameLabel.isDisplayed()) {
			return userNameLabel.getText();
		}
		else
		{
			return "User name is not displayed";
		}
	}
	
	public ContactsPage clickContactsMenuLink(String menuName) {
		Actions action = new Actions(driver);
		action.moveToElement(navmenu).build().perform();
		for(WebElement link : navMenuLinks) {
			if(link.getText().equalsIgnoreCase(menuName)) {
				link.click();
				break;
			}
		}
		clickOutside.click();
		return new ContactsPage();
	}
	
	public DealsPage clickDealsMenuLink(String menuName) {
		for(WebElement link : navMenuLinks) {
			if(link.getText().equalsIgnoreCase(menuName)) {
				link.click();
				break;
			}
		}
		return new DealsPage();
	}
}
