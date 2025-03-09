package com.crm.qa.listeners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverListener;

import com.crm.qa.util.TestUtil;

public class EventListener implements WebDriverListener {

//	@Override
//	public void beforeAnyCall(Object target, Method method, Object[] args) {
//		System.out.println("Before calling method: " + method.getName());
//	}
//
//	@Override
//	public void afterAnyCall(Object target, Method method, Object[] args, Object result) {
//		System.out.println("After calling method: " + method.getName());
//	}

	@Override
	public void beforeGet(WebDriver driver, String url) {
		System.out.println("Before navigating to URL: " + url);
	}

	@Override
	public void afterGet(WebDriver driver, String url) {
		System.out.println("After navigating to URL: " + url);
	}

	@Override
	public void afterClose(WebDriver driver) {
		System.out.println("Quiting the driver");
	}

	@Override
	public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
		System.out.println("Exception Occurred : " + e );
		TestUtil.takesScreenShotOnError();
	}
}
