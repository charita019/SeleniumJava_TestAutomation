package com.crm.qa.util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	public static long EXPLICIT_WAIT = 10;
	public static String mainWindow;
	public static String subWindow;
	public static JavascriptExecutor js;

	public enum waitEnum {
		waitForUrl, waitForIcon
	}

	public void switchWindow() {
		mainWindow = driver.getWindowHandle();
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		while (it.hasNext()) {
			subWindow = it.next();
			if (!mainWindow.equals(subWindow)) {
				driver.switchTo().window(subWindow);
			}
		}
	}

	public void executeUsingJavaScript(WebDriver driver, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public void explicitWaitFor(waitEnum enumVal) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		if (enumVal == waitEnum.waitForUrl) {
			wait.until(ExpectedConditions.urlContains("ui.cogmento.com"));
		} else if (enumVal == waitEnum.waitForIcon) {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@class='large user red icon']")));
		}
	}

	public static void takesScreenShotOnError(String testMethodName) {
		try {
			TakesScreenshot screenshot = ((TakesScreenshot) driver);
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			String currentDir = System.getProperty("user.dir");
			FileUtils.copyFile(sourceFile, new File(currentDir + "/FailureScreenshots/" + "Bug-" +System.currentTimeMillis()+"_"+ testMethodName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void drawBorder(WebDriver driver, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
}
