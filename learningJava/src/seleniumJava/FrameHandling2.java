package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.name("mytext1")).sendKeys("Test Frame1");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.findElement(By.name("mytext2")).sendKeys("Test frame 2");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(3);
		driver.findElement(By.name("mytext4")).sendKeys("Test frame 4");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.findElement(By.name("mytext3")).sendKeys("Test Frame 3");
		
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector(".AB7Lab.Id5V1")).click();

	}

}
