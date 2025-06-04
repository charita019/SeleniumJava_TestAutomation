package com.crm.qa.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.crm.qa.base.TestBase;

public class JavaScriptUtil extends TestBase{
	
	private JavascriptExecutor js;
	
	public JavaScriptUtil(WebDriver driver) {
		js = (JavascriptExecutor)driver;
	}
	
	public void clickElementUsingJS(WebDriver driver, WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}
	
	public void drawBorder(WebDriver driver, WebElement element) {
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public void ScrollIntoView(WebElement element) {
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}

