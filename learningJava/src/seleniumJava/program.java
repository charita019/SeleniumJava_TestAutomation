package seleniumJava;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class program {

//	@Test
//	public static void prog() {
//		int[] values = {1,2,3,4,5,6,7,8,9,10};
//		for(int i = 0; i<Y; ++i)
//			System.out.println(values[i]);
//	}
//	
	WebElement emailInput;
	WebElement passwordInput;
	WebElement loginBtn;
	WebDriver webDriver;

	@BeforeMethod
	public void setUp() {
		if (webDriver == null) {
			webDriver = new ChromeDriver();
		}
		webDriver.get(
				"https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
		webDriver.manage().window().maximize();

		emailInput = webDriver.findElement(By.id("email-input"));
		passwordInput = webDriver.findElement(By.id("password-input"));
		loginBtn = webDriver.findElement(By.id("login-button"));

	}

	@Test
	public void AppTest() {
		Boolean emailDisplay = emailInput.isDisplayed();
		assertTrue(emailDisplay);
		Boolean passwordDisplay = passwordInput.isDisplayed();
		assertTrue(passwordDisplay);
	}

	@Test
	public void requirement2() {
		emailInput.sendKeys("login@codility.com");
		passwordInput.sendKeys("password");
		loginBtn.click();

		String text = webDriver.findElement(By.xpath("//div[@class='message success']")).getText();
		assertEquals(text, "Welcome to Codility");
	}

	@Test
	public void requirement3() {
		emailInput = webDriver.findElement(By.id("email-input"));
		passwordInput = webDriver.findElement(By.id("password-input"));
		loginBtn = webDriver.findElement(By.id("login-button"));
		emailInput.sendKeys("unknown@codility.com");
		passwordInput.sendKeys("password");
		loginBtn.click();

		String invalidEmailText = webDriver.findElement(By.xpath("//div[@class='message error']")).getText();
		assertEquals(invalidEmailText, "You shall not pass! Arr!");
	}

	@Test
	public void requirement4() {
		emailInput = webDriver.findElement(By.id("email-input"));
		loginBtn = webDriver.findElement(By.id("login-button"));
		emailInput.sendKeys("1233");
		loginBtn.click();

		String validEmailText = webDriver.findElement(By.xpath("//div[@class='validation error']")).getText();

		assertEquals(validEmailText, "Enter a valid email");
	}

	@Test
	public void requirement5() {

		emailInput = webDriver.findElement(By.id("email-input"));
		passwordInput = webDriver.findElement(By.id("password-input"));
		loginBtn = webDriver.findElement(By.id("login-button"));

		loginBtn.click();

		ArrayList<String> actual = new ArrayList<String>();
		List<WebElement> msgs = webDriver.findElements(By.xpath("//div[@class='validation error']"));
		for (WebElement msg : msgs) {
			if (msg.getText().contains("is required")) {
				actual.add(msg.getText());
			}
		}

		Assert.assertEquals(actual.get(0), "Email is required");
		Assert.assertEquals(actual.get(1), "Password is required");
	}

	@Test
	public void requirement6() {
		emailInput = webDriver.findElement(By.id("email-input"));
		passwordInput = webDriver.findElement(By.id("password-input"));

		emailInput.sendKeys("login@codility.com");
		
		Actions action = new Actions(webDriver);
		action.sendKeys(Keys.TAB).perform();
		passwordInput.sendKeys("password");
		action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	}

	@AfterMethod
	public void tearDown() {
		webDriver.quit();
		webDriver = null;
	}

}
