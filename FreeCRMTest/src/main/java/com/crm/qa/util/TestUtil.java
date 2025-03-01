package com.crm.qa.util;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase	{
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT =20;
	public static long EXPLICIT_WAIT =10;
	public static String mainWindow;
	public static String subWindow;
	public static JavascriptExecutor js;
	
	public void switchWindow() {
		mainWindow = driver.getWindowHandle();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		while(it.hasNext()) {
			subWindow = it.next();
			if(!mainWindow.equals(subWindow)) {
				driver.switchTo().window(subWindow);
			}
		}
	}
	
	public void executeUsingJavaScript(WebDriver driver, WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void waitForPageLoad() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.urlContains("ui.cogmento.com"));
	}
}
