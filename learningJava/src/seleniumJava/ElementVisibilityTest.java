package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(
				"https://admin.formstack.com/login?login_challenge=qxgc3ilD9FESfzKx955PMbBXZeBU0ypuSTEnkVeW58u48Si5VyLlcbLWAgrSf9O2wnjBKUXkpx0A4MViHTOs6rqPPgYNIASDnfcySuEMM88YuaIELnmWxIiRIOh6BVlmuk1Xb6APLcSqUNmaayuJmf7bVdMV26S6LE-C09loHXNN6YlVyjWQuUtMn3GpsmL4Ay3bbnocu_fCKzH8m8p_bD_Bqi1TP-YmtVpXZdcfNwztLqe9dL4BwVJFqQyTd6o65hrugcXDoOs3Io1G0cgukc_VXXZ55uqdPoJzK50xYK1pE6qOHGyR1_5FfafXh7PWAQLmg5TSMCqqf6vbVRn-_JOQWjvh1wswxMANIvCVS_BY7Y006YEx4RT3I-LggirR86jHvEDZAq_w0dW1IJFciD6xPuJHW4ZhNuHe5Df1ZvavXlx7E8T8E3ZZ8xpGc6CW04pHWQN8LraAZGgt5EyZcRzgNV_gWSM2fCvGzi7QkVzFUsi8t_nEqErxbMSQMAuflAhNsCDYF_UE92V5F6rBUwVaA7JCa6vxnSbXw25XidmddwsVW4B92Hn8m6xE0NymWfNLFqmzO3uBSLY0p0gWOvX7yX8w2Wq0NnPBKvbSb2G6iOTfK2jKV4F3tXMHBtyTkoeXKrBMyWisyEI2QbCxYU2Rx24L18K5qag1pJh_aM97bHVjN3Czg2qZKEM87dMwv6BuYTGKxJWNCZbgAtvr9r81nc81N2VvZq8QS7tf0ov47qB5n5UBRUPcBL3VViRFMWhmMltuZO2NvWs5yC2JjQxd7NXXTUZIIxiCnaONDx8WwtgO7eGzIRn_2s4jP7kFzk8HERc51MMF2-0iejeZIOEgK5WKiz58AXtjbHNkZLARw2kmcrY-91odaiUpKDh7sOGOY9lfX-0JmGGCL4Oy0BoX_PtgMfMJ80_3eTNS7-LMQnDZxjVg4lwJViVRGyBVM5yMrTX6u4X-7qDT45hGao3IbI4xh60c0NceIJVq33Git4wbqGOQJPpKQWZKKm8AXRoQDZ54GEeGEzwxDhNnuci4DCfpVkYFBYDLuqpypuqu8GKKv6EiT4k8EGJfKLRGCNio_GwwY5tpPzcTK_jrpAXuYD1HwCxxY3ff_Xy6xrmA4uHC3ap77s-pVte0LCxupMoSbdYUFcaiEhDy9OfsL4ppjTiaXUCw7uO4LjiWLH-yfd6h2WOqzaaIWzSroQ7TG0vXq3luFgD0oWuNf5PYDnAR9UvodKGxMl4Gh5G8-Y2xUasrPYBrhzWvMhzvAn1p-Hra3Z9d5ycVeu6eWEFVVG_nVY9bvNsMlsmMQ4kqUnY_at14YAi0gDel0s5m-0U_8R2-A7tDPLstB1A1omG_ZeMEh97LvxNIcZbs5irqg4W_eMs7NRP0gYghk6sOFWHAxltifvycJRdVy5UF0r92MGpXNjMdHUX1wPFrF30T2ia1MBs8UK0X3m8xR8ivNMUGUpPkpaqHsCl0WtuEO0u9nAVHr1GXNxFxtZlQEacls_uy7xgWUUg3P4HwBVJUR_sHyzPq3LYCU-EGjBQHKwAadtS23wcs3SNHjOtq3Isvmew8dzvYVjyc_p0fU8AFSx46ZB71h4tv");

		// 1. isDisplayed
		WebElement btn=driver.findElement(By.xpath("//button[@data-test='nextButton']"));
		boolean b1 = btn.isDisplayed();
		System.out.println(b1); //true
		
		// 2. isEnabled
		boolean b2=btn.isEnabled();
		System.out.println(b2); //false
		
		WebElement input=driver.findElement(By.id("emailInput"));
		input.sendKeys("test@test.com");
		boolean b3= btn.isEnabled();
		System.out.println(b3); //true
		
		// 3. isSelected - only for radio buttons, checkboxes and radio buttons
		driver.get("https://test-login-app.vercel.app/");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='remember']"));
		checkbox.click();
		boolean b4= checkbox.isSelected();
		System.out.println(b4); //true
		
		checkbox.click();
		boolean b5=checkbox.isSelected();
		System.out.println(b5); //false
	}
	

}
