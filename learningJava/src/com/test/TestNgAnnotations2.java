package com.test;

import org.testng.annotations.*;

public class TestNgAnnotations2 {
	
	@BeforeSuite
	public void BeforeSuiteMethod2() {
		System.out.println("I am before suite -2");
	}
	
//	@BeforeTest
//	public void BeforeTestMethod2() {
//		System.out.println("I am before test - 2");
//	}
	
	@BeforeClass
	public void BeforeClassMethod2() {
		System.out.println("I am before Class - 2");
	}
	
	@BeforeMethod
	public void BeforeMethodFunc2() {
		System.out.println("I am before method - 2");
	}
	
	@Test (priority = 1)
	public void TestA2() {
		System.out.println("I am Test A2 - 2");
	}
	
	@Test
	public void TestB2() {
		System.out.println("I am Test B2 - 2");
	}
	
	
	@AfterSuite
	public void AfterSuiteMethod2() {
		System.out.println("I am after suite -2");
	}
	
//	@AfterTest
//	public void AfterTestMethod() {
//		System.out.println("I am after test -2 ");
//	}
	
	@AfterClass
	public void AfterClassMethod2() {
		System.out.println("I am after Class - 2");
	}
	
	@AfterMethod
	public void AfterMethodFunc2() {
		System.out.println("I am after method - 2");
	}

}
