package com.crm.qa.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.crm.qa.util.TestUtil;

public class CustomListener extends TestUtil implements ITestListener {

	private static ExtentReports extent;
	private static ExtentTest extentTest;

	public void onStart(ITestContext context) {
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Tester", "Charita");
		extent.setSystemInfo("Operating System", "Windows 11");
		extent.setSystemInfo("Browser", "Google Chrome");
		extent.setSystemInfo("Application", "FreeCRM");
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		//creating a test entry in the report with the method name
		extentTest = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "Test Passed" + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED TEST");
		TestUtil.takesScreenShotOnError(result.getMethod().getMethodName());
		extentTest.log(Status.FAIL, "Test Failed: " + result.getThrowable().getMessage());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, "Test Skipped" + result.getMethod().getMethodName());
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush(); // Generates the report
	}
}
