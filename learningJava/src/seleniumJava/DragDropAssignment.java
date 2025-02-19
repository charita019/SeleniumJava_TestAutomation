package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAssignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/Static.html");

		Actions action = new Actions(driver);

		action.clickAndHold(driver.findElement(By.id("angular"))).moveToElement(driver.findElement(By.id("droparea")))
				.release().build().perform();
		action.clickAndHold(driver.findElement(By.id("mongo"))).moveToElement(driver.findElement(By.id("droparea")))
		.release().build().perform();
		action.clickAndHold(driver.findElement(By.id("node"))).moveToElement(driver.findElement(By.id("droparea")))
		.release().build().perform();

	}

}
