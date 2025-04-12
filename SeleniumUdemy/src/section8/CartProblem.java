package section8;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartProblem {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String[] expectedItems = {"Cucumber", "Brocolli" , "Beetroot", "Apple"};
		int count = 0;

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i =0 ; i<products.size() ; i++) {
			
			String[] productName = products.get(i).getText().split("-");
			String formattedName = productName[0].trim();
			
			//1. check whether name extracted is present in array or not
			//2. convert array into arraylist : Array take less memory
			
			List itemsNeededList = Arrays.asList(expectedItems);
			
			
			if(itemsNeededList.contains(formattedName)) {
				count++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(count==expectedItems.length) {
					break;
				}
			}
			
		}
	}

}
