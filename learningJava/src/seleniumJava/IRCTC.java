package seleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right ng-tns-c65-11']")).click();
		List<WebElement> droplist = driver.findElements(By.xpath("//li[@role='option']/descendant::span"));
		System.out.println(droplist.size());
		
		for(int i = 0 ;i<droplist.size();i++) {
			if(droplist.get(i).getText().equalsIgnoreCase("AC First Class (1A)")){
				droplist.get(i).click();
				break;
			}
		}

	}

}
