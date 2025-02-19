package seleniumJava;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebTableHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://freecrm.com/en");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

		driver.findElement(By.linkText("LOGIN")).click();

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String ParentId=it.next();
		String ChildId=it.next();
		
		driver.switchTo().window(ChildId);
		
		String childwindowtitle = driver.getTitle();
		System.out.println(childwindowtitle);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.name("email")).sendKeys("charitasharma1901@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("HP#2025");
		driver.findElement(By.cssSelector(".ui.fluid.large.blue.submit.button")).click();

		WebElement menu=driver.findElement(By.id("main-nav"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).build().perform();
		
		ArrayList<String> ar=new ArrayList<String>();
		
		List<WebElement> menuitems=driver.findElements(By.className("menu-item-wrapper"));
		for(int i=0;i<menuitems.size();i++) {
			ar.add(menuitems.get(i).getText());
		}
		System.out.println(ar);
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).equals("Contacts")) {
				WebElement menulink=driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
				menulink.click();
				break;
			}
		}
		
		//close the open navigation menu - click anywhere outside
		//1. use body tagname and and perform a click
		//2. use actions class - moveByOffset method
		//3. Using Javascript Executor
		WebElement body=driver.findElement(By.tagName("body"));
		body.click();
		
		String before_xpath="//div[@class='table-wrapper']/table/tbody/tr[";
		String after_xpath = "]/td[2]/a";

		
		//Method 1:
//		for(int i=1;i<=5;i++) {
//			String name=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
//			System.out.println(name);
//			if(name.contains("J S")) {
//				WebElement recordcheck=driver.findElement(By.xpath("//div[@class='table-wrapper']/table/tbody/tr["+i+"]/td[1]/div/input"));
//				JavascriptExecutor js=(JavascriptExecutor)driver;
//				js.executeScript("arguments[0].click()", recordcheck);
//			}
//		}
		
		//Method 2:
		WebElement recordcheck1 = driver.findElement(By.xpath("//a[contains(text(),'C S')]/parent::td//preceding-sibling::td//input[@name='id']"));
		WebElement recordcheck2 = driver.findElement(By.xpath("//a[contains(text(),'J S')]/parent::td//preceding-sibling::td//input[@name='id']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", recordcheck1);
		js.executeScript("arguments[0].click()", recordcheck2);
	}
}
