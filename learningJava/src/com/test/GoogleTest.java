package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
//		System.setProperty("webdriver.chrome.driver",
//				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	}

	@Test(priority = 1, groups = "Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority = 3, groups = "Logo Test")
	public void googleLogoTest() {
		boolean logoDisplayed = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		System.out.println(logoDisplayed);
	}

	@Test(priority = 2, groups = "link test")
	public void gmailLinkTest() {
		boolean maillink = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(maillink);
	}

	@Test(priority = 4, groups = "Test Group")
	public void Test1() {
		System.out.println("Test1");
	}

	@Test(priority = 6, groups = "Test Group")
	public void Test2() {
		System.out.println("Test2");
	}

	@Test(priority = 5, groups = "Test Group")
	public void Test3() {
		System.out.println("Test3");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
