package seleniumJava;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		//String ParentId=driver.getWindowHandle();
		//String ParentWindowTitle=driver.getTitle();
		
		//Single Child Window
		Set<String> handler=driver.getWindowHandles();
		//set does not store values in indexes
		//to get value from set - user iterator
		
		Iterator<String> it=handler.iterator();
		String parentWindowId=it.next();
		System.out.println("Parent Window ID : " + parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("child Window Id : " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("Child Window popup title : " + driver.getTitle());
		
		driver.close(); //close specific browser window.
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("Parent Window Title : " + driver.getTitle());
		
		//driver.quit(); //quit the driver instance ; close all browsers
		
		//

	}

}
