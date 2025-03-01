package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		//int i = 9/0;
	}
	
	@Test (dependsOnMethods = "loginTest")
	public void HomePageTest() {
		System.out.println("Login Test");
	}
	
	@Test (dependsOnMethods = "loginTest")
	public void searchPageTest() {
		System.out.println("search page test");
	}
	
	@Test (dependsOnMethods = "loginTest")
	public void registraionPageTest() {
		System.out.println("Registration page test");
	}
}
