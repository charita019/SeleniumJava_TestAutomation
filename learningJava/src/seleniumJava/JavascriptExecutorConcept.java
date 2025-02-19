package seleniumJava;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://freecrm.com/en");

		driver.findElement(By.linkText("LOGIN")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String ParentWindowId = it.next();
		String ChildWindowId = it.next();

		driver.switchTo().window(ChildWindowId);

		// crm - login page xpaths
		driver.findElement(By.name("email")).sendKeys("charitasharma1901@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("HP#2025");
		// driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).click();

		WebElement loginbtn = driver
				.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]"));
		flash(loginbtn, driver);
		drawBorder(loginbtn, driver);
		
		try {
			TakesScreenshot scrnshot = (TakesScreenshot)driver;
			File src=scrnshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("E:\\Charita\\Study\\Sample\\bug.png"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		generateAlert(driver,"There is an issue with login button on login page");
		driver.switchTo().alert().accept();
		
		clickElementByJS(loginbtn,driver);
		
		driver.navigate().refresh(); // refresh the page - Selenium
		
		//2. By using javascript executor
		refreshBrowserByJS(driver);
		
		//get title of page by JS
		System.out.println(getTitleByJS(driver));
		
		//get Inner Text - entire text of the page
		System.out.println(getInnerText(driver));
		
		//scroll page down
		//scrollPageDown(driver);
		
		WebElement signup = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
		scrollIntoView(signup,driver);
	}
		
	public static void flash(WebElement element, WebDriver driver) {
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor= '" + color + "'", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",element);
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getInnerText(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String pagetext=js.executeScript("return document.documentElement.innerText;").toString();
		return pagetext;
	}
	
//	public static void scrollPageDown(WebDriver driver) {
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}