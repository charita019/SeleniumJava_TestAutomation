package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	//Pre - Condition Annotations - Starts with @Before : Part 1
	@BeforeSuite //1
	public void setup() {
		System.out.println("Setup system property for chrome");
	}
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("Launch Chrome Browser");
	}
	
	@BeforeClass //3
	public void login() {
		System.out.println("Login to App");
	}
	
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("Enter URL");
	}
	
	//Test Case - @Test Annotation - Part 2
	@Test //5
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("Google logo test");
	}
	
	//Post Conditions - After Test : starts with @After : Part3
	@AfterMethod //6
	public void logOut() {
		System.out.println("Logout from the App");
	}
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}
	
	@AfterSuite //9
	public void generateTestReport(){
		System.out.println("Generate test report");
	}
}
