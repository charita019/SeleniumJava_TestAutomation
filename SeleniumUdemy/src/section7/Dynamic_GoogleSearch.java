package section7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_GoogleSearch {
	
	public void dynamicDropdownValueSelect(WebDriver driver, String inputTxt, String textToClick) {
		driver.findElement(By.id("APjFqb")).sendKeys(inputTxt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li//descendant::div[@class='wM6W7d']"));
		System.out.println("Number of suggestions coming is : " + list.size());
		
		for(WebElement option : list) {
			if(option.getText().equalsIgnoreCase(textToClick)) {
				option.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");
		
		Dynamic_GoogleSearch search = new Dynamic_GoogleSearch();
		search.dynamicDropdownValueSelect(driver,"Testing","testing interview questions");
	}
}
