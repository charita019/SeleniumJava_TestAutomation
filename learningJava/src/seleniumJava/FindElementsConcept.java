package seleniumJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// 1. get total count of links on the page
		// 2. get the text of each link on the page

		//driver.get("https://saucelabs.com/");
		driver.get("https://www.facebook.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		// input fields - input tag name
		// buttons on page - button tag

		// size of list
		System.out.println(links.size());
		
		//blank spaces - blank links
		for (int i = 0; i < links.size(); i++) {
			String linktext= links.get(i).getText();
			System.out.println(linktext);
			
		}

	}

}
