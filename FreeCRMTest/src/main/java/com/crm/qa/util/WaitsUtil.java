package com.crm.qa.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsUtil{
	
	private static long EXPLICIT_WAIT = 10;
	private WebDriver driver;
	private WebDriverWait wait;

	public WaitsUtil(WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(EXPLICIT_WAIT));
	}
	
	public void waitForVisibility(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
