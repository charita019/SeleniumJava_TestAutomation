package com.crm.qa.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.crm.qa.util.TestUtil;

public class CustomListener extends TestUtil implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED TEST");
		TestUtil.takesScreenShotOnError(result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
}
