package seleniumJava;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTable2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tables");
		
		driver.manage().window().maximize();
		
		List<WebElement> lastnames = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
		String[] beforesort = new String[lastnames.size()];
		for(int i = 0; i<lastnames.size();i++) {
			beforesort[i] = lastnames.get(i).getText();
		}

//		for(String name : beforesort) {
//			System.out.println(name);
//		}
//		
		Arrays.sort(beforesort);
		
		for(String name : beforesort) {
			System.out.println(name);
		}
		
		driver.findElement(By.xpath("//table[@id='table1']//*[contains(text(),'Last Name')]")).click();
		
		lastnames = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[1]"));
		String[] aftersort = new String[lastnames.size()];
		for(int i = 0; i<lastnames.size();i++) {
			aftersort[i] = lastnames.get(i).getText();
		}
		
		Assert.assertEquals(aftersort, beforesort);

	}

}
