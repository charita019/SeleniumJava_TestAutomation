package com.crm.qa.listeners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

import com.crm.qa.util.TestUtil;

public class EventListener extends TestUtil implements WebDriverListener {

	@Override
	public void beforeGet(WebDriver driver, String url) {
		System.out.println("Before navigating to URL: " + url);
	}

	@Override
	public void afterGet(WebDriver driver, String url) {
		System.out.println("After navigating to URL: " + url);
	}
	
	@Override
	public void beforeClick(WebElement element) {
		System.out.println("Before clicking : " + element);
	}
	
	@Override
	public void afterClick(WebElement element) {
		System.out.println("After clicking : " + element);
	}

	@Override
	public void afterClose(WebDriver driver) {
		System.out.println("Quiting the driver");
	}

	@Override
	public void onError(Object target, Method method, Object[] args, InvocationTargetException e) {
		System.out.println("Exception Occurred : " + e );
	}
}
