package com.test;

import org.testng.annotations.*;

public class TestNgAnnotations {
	
	@BeforeSuite
	public void BeforeSuiteMethod() {
		System.out.println("I am before suite - 1");
	}
	
//	@BeforeTest
//	public void BeforeTestMethod() {
//		System.out.println("I am before test - 1" );
//	}
	
	@BeforeClass
	public void BeforeClassMethod() {
		System.out.println("I am before Class - 1");
	}
	
	@BeforeMethod
	public void BeforeMethodFunc() {
		System.out.println("I am before method - 1");
	}
	
	@Test (priority = 1)
	public void TestA() {
		System.out.println("I am Test A - 1");
	}
	
	@Test
	public void TestB() {
		System.out.println("I am Test B - 1 ");
	}
	
	
	
	@AfterSuite
	public void AfterSuiteMethod() {
		System.out.println("I am after suite -1 ");
	}
	
//	@AfterTest
//	public void AfterTestMethod() {
//		System.out.println("I am after test -1 ");
//	}
	
	@AfterClass
	public void AfterClassMethod() {
		System.out.println("I am after Class - 1");
	}
	
	@AfterMethod
	public void AfterMethodFunc() {
		System.out.println("I am after method - 1 ");
	}

}
