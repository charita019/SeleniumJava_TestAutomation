package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TutorialsPointiFrameHandling {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.tagName("a")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		String frame2Text = driver.findElement(By.xpath("//h1[text()='Selenium - Automation Practice Form']")).getText();
		System.out.println(frame2Text);
		
		driver.switchTo().defaultContent();
		
		String MainPageHeading = driver.findElement(By.xpath("//h1[text()='Frames']")).getText();
		System.out.println(MainPageHeading);
		

	}

}
