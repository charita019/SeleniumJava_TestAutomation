package section10;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WindowHandles {

	public static void main(String[] args) {

		WebDriverWait wait;
		JavascriptExecutor js;

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("./Extensions/extension.crx")); // running script with extensions

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.findElement(By.cssSelector("a.bmc-btn")).click();

		String parentwindowId = driver.getWindowHandle();

		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> it = windowids.iterator();

		while (it.hasNext()) {
			String childwindowid = it.next();
			if (!parentwindowId.equals(childwindowid)) {
				driver.switchTo().window(childwindowid);
				wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.urlContains("buymeacoffee"));
				String childwindowtitle = driver.getTitle();
				System.out.println(childwindowtitle);
				Assert.assertEquals(childwindowtitle,
						"Yadagiri Reddy is Content Creator | Technical Blogger | YouTuber", "Title does not match");
				driver.close();
			}
		}
		driver.switchTo().window(parentwindowId);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//Handle the AD Pop-up!!!
//		try {
//			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName("iframe")));
//			WebElement adpopupbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dismiss-button")));
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", adpopupbtn);
//			System.out.println("Ad popup closed successfuly");
//		} catch (Exception e) {
//			 System.out.println("Ad popup not present or failed to close: " + e.getMessage());
//		} finally {
//		    driver.switchTo().defaultContent();
//		}
		
		
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total iframes is : " + iframes.size());
		
		for(WebElement frame : iframes) {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(frame);
			 List<WebElement> dismissButtons = driver.findElements(By.id("dismiss-button"));
			 
			 if (!dismissButtons.isEmpty()) {
			        WebElement adpopupbtn = dismissButtons.get(0);
			        js=(JavascriptExecutor)driver;
			        js.executeScript("arguments[0].click();", adpopupbtn);
			        System.out.println("Ad popup closed.");
			        break;
			    }
		}
		driver.switchTo().defaultContent();
		
		
		wait.until(ExpectedConditions.urlContains("hyrtutorials"));
		String parentWindowTitle = driver.getTitle();
		System.out.println(parentWindowTitle);
		Assert.assertEquals(parentWindowTitle, "Window Handles Practice - H Y R Tutorials", "Title does not match");

		WebElement newWindowBtn = driver.findElement(By.id("newWindowBtn"));
		String parentWindowId = driver.getWindowHandle();
		newWindowBtn.click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it1 = handles.iterator();
		while (it1.hasNext()) {
			String childWindowId = it.next();
			if (!parentWindowId.equals(childWindowId)) {
				driver.switchTo().window(childWindowId);
				driver.manage().window().maximize();

				driver.findElement(By.id("firstName")).sendKeys("Elena");
				driver.findElement(By.id("lastName")).sendKeys("Salvatore");

				List<WebElement> radioBtns = driver.findElements(By.cssSelector("input.bcRadioButton"));
				radioBtns.stream().filter(rb -> "femalerb".equalsIgnoreCase(rb.getAttribute("id"))).findFirst()
						.ifPresent(WebElement::click);
			}
		}

	}

}
