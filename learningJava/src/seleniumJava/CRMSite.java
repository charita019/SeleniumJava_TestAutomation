package seleniumJava;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CRMSite {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://freecrm.com/en");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

		driver.findElement(By.linkText("LOGIN")).click();

		String ParentWindowId = driver.getWindowHandle();
		System.out.println(ParentWindowId);
		String ParentWindowTitle = driver.getTitle();
		System.out.println(ParentWindowTitle);
		String ChildWindowId = null;
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			ChildWindowId = it.next();
		}
		if (!ParentWindowId.equals(ChildWindowId)) {
			driver.switchTo().window(ChildWindowId);
		}
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
			if(ar.get(i).equals("Documents")) {
				WebElement menulink=driver.findElement(By.xpath("//span[contains(text(),'Documents')]"));
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
		
//		driver.findElement(By.xpath("//button[contains(text(),'New Folder')]")).click();
//		
//		driver.findElement(By.name("addFolderName")).sendKeys("QA");
//		
//		driver.findElement(By.xpath("//button[@class='ui button']")).click();
		
		List<WebElement> folderlist=driver.findElements(By.xpath("//div[@role='list']"));
		String folders=null;
		for(int i=0;i<folderlist.size();i++) {
			folders=folderlist.get(i).getText();
		}
		System.out.print(folders);
		String f[]=folders.split("\n");
		for(int i=0;i<f.length;i++) {
			if(f[i].toString().equals("QA")) {
				driver.findElement(By.xpath("//a[contains(text(),'QA')]")).click();
				break;
			}
		}
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		
//		//form test
		driver.findElement(By.name("title")).sendKeys("QA Document");
		driver.findElement(By.name("description")).sendKeys("Test QA Doucment of Image Type");
		driver.findElement(By.name("identifier")).sendKeys("QA Folder");
		
		
		
		
	}
}
