package com.crm.qa.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	public static String mainWindow;
	public static String subWindow;

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

	public static void takesScreenShotOnError(String testMethodName) {
		try {
			TakesScreenshot screenshot = ((TakesScreenshot) driver);
			File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
			String currentDir = System.getProperty("user.dir");
			String timeStamp = new SimpleDateFormat("YYYYMMdd_HHmmss").format(new Date());
			String destPath = currentDir + "/FailureScreenshots/" + testMethodName + "_" + timeStamp + ".jpg";
			FileUtils.copyFile(sourceFile, new File(destPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
