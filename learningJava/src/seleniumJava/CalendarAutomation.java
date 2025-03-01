package seleniumJava;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/en");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("LOGIN")).click();
		
		String ParentWindowId=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String ChildWindowId=it.next();
			if(!ParentWindowId.equals(ChildWindowId)) {
				driver.switchTo().window(ChildWindowId);
			}
		}
		
		driver.findElement(By.name("email")).sendKeys("charitasharma1901@gmail.com");
		driver.findElement(By.name("password")).sendKeys("HP#2025");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		WebElement navmenu=driver.findElement(By.id("main-nav"));
		Actions action = new Actions(driver);
		action.moveToElement(navmenu).build().perform();
		
		List<WebElement> list = driver.findElements(By.className("menu-item-wrapper"));
		for(WebElement ls : list) {
			if(ls.getText().equalsIgnoreCase("Calendar")) {
				ls.click();
				break;
			}
		}
		
		
		
		


	}

}
