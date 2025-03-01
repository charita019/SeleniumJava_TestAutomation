package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test (invocationCount = 10)
	public void sum() {
		int num1 = 10;
		int num2 = 20;
		int sumtotal = num1 + num2;
		System.out.println("The sum of 2 numbers is : " + sumtotal);
	}

}
