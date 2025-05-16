package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class NavigationMenu extends TestBase {
	
	@FindBy(id = "main-nav")
	private WebElement navigationmenu;
	
	@FindBy(xpath="//div[@class='menu-item-wrapper']")
	private List<WebElement> navigationList;
		
	public NavigationMenu() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void NavigationToMenu(String menuname) {
		Actions action = new Actions(driver);
		action.moveToElement(navigationmenu).build().perform();
		for(WebElement menulink : navigationList) {
			if(menulink.getText().contains(menuname)) {
				menulink.click();
			}
		}
	}
}
