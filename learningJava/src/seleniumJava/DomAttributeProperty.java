package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomAttributeProperty {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		System.out.println(driver.findElement(By.id("input-email")).getDomAttribute("placeholder"));
		System.out.println(driver.findElement(By.id("input-email")).getDomProperty("placeholder"));
		driver.findElement(By.id("input-email")).sendKeys("HP@hogwarts.com");
		System.out.println(driver.findElement(By.id("input-email")).getDomAttribute("value"));
		System.out.println(driver.findElement(By.id("input-email")).getDomProperty("value"));
		

	}

}
