package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Constants;
import base.TestBase;

public class FreeCrmTest {
	
	@BeforeMethod
	public void setUp() {
		TestBase.initialize();
	}	
	
	@Test (priority = 1)
	public void verifyFreeCrmTitleTest() {
		String title = TestBase.driver.getTitle();
		System.out.println("Page Title is : " + title);
		Assert.assertEquals(title, Constants.mainPageTitle, "Title does not match");
	}
	
	@Test (priority = 2)
	public void verifyEditionTest() {
		Assert.assertEquals(TestBase.driver.findElement(By.cssSelector("div.mui-8widun")).isDisplayed(),true);
	}
	
	@AfterMethod
	public void tearDown() {
		TestBase.quit();
	}

}
