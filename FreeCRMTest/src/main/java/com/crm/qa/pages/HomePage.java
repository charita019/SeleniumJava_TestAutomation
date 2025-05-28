package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//span[contains(@class,'user-display')]")
	private WebElement userNameLabel;
	
	@FindBy(id = "main-nav")
	private WebElement navmenu;
	
	@FindBy(xpath = "//div[@class='menu-item-wrapper']")
	private List<WebElement> navMenuLinks;
	
	@FindBy(tagName = "body")
	private WebElement clickOutside;
	
	NavigationMenu navigationMenu;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		navigationMenu=new NavigationMenu();
	}
	
	public HomePage clickHomePageLink(String name) {
		navigationMenu.NavigationToMenu(name);
		
		return new HomePage();
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
}
