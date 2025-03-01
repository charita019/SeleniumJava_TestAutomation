package seleniumJava;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		String alerttext=alert.getText();
		
		System.out.println(alerttext);
		
		if(alerttext.equals("Please enter a valid user name")) {
			System.out.println("Test is passed!!");
		}
		else {
			System.out.println("Test is Failed");
		}
		
		alert.accept();
	}
}
