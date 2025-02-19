package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAssignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://the-internet.herokuapp.com/drag_and_drop");

		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.cssSelector("#column-a")))
				.moveToElement(driver.findElement(By.id("column-b"))).release().build().perform();
		
		action.clickAndHold(driver.findElement(By.cssSelector("#column-b")))
		.moveToElement(driver.findElement(By.id("column-a"))).release().build().perform();

	}

}
