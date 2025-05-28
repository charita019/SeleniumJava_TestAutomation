package com.test;

import org.testng.annotations.Test;

public class TestNgPriorityTest {

	/*
	 * 1. No Priority = Executes in Alphabetic Order of Method Name
	 * 2. Priority = 0 ; Executes in Alphabetic Order of Method Name 
	 * 	>> I am AMethodA
		>> I am Method A
		>> I am Test Method C
		>> I am XMethod B
	 * 3. Priority = +ve ; based on numbering test is executed
	 * 4. Priority = -ve ; executed first : -ve and then +ve (-1,1,2)
	 * 5. Priority = -ve, 0 , +ve ; 1st - negative, then 0, then Positive
	 * 6. Mix of -ve, no priotity , zero and positive ; 
	 */
	
	@Test
	public void MethodD() {
		System.out.println(">> I am Method D");
	}
	
	@Test
	public void MethodA() {
		System.out.println(">> I am Method A");
	}
	
	@Test (priority = 1)
	public void XMethodA() {
		System.out.println(">> I am AMethodA");
	}
	
	@Test (priority = -1)
	public void TestMethodC() {
		System.out.println(">> I am Test Method C");
	}
	
	
	@Test (priority = 0)
	public void MethodB() {
		System.out.println(">> I am Method B");
	}
	

}
