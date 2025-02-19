package seleniumJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSeachBox_Assignment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		
		WebElement searchinput = driver.findElement(By.id("autocomplete"));
		searchinput.sendKeys("land");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@id='ui-id-1']/li//descendant::div[starts-with(@id,'ui-id')]"));
		System.out.println("Total number of suggestions is : => " + list.size());
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equalsIgnoreCase("solomon islands")) {
				list.get(i).click();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollTo(0,0);");
				break;
				
			}
		}
		

	}

}
