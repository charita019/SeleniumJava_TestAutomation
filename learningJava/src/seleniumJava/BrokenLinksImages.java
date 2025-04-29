 package seleniumJava;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksImages {

	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		// number of links only in footer section
		//1. get all the links
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		List<WebElement> footerlinks = footer.findElements(By.tagName("a"));
		List<WebElement> activelinks = new ArrayList<WebElement>();
		System.out.println("Number of links in the footer is : " + footerlinks.size());

		//2. iterate : exclude links that do not have any href attribute
		for (int i = 0; i < footerlinks.size(); i++) {
			//System.out.println(footerlinks.get(i).getText());
			System.out.println(footerlinks.get(i).getAttribute("href"));
			if(footerlinks.get(i).getAttribute("href")!=null) {
				activelinks.add(footerlinks.get(i));
			}
		}
		System.out.println(activelinks.size());
		
		//3. check the href url with http connection api
		for (int j=0; j<activelinks.size();j++) {
			try {
				HttpURLConnection conn = (HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
				conn.connect();
				
				int rescode = conn.getResponseCode();
				String resmsg = conn.getResponseMessage();
				
				conn.disconnect();
				
				System.out.println(activelinks.get(j).getAttribute("href") + "---->" + resmsg + rescode);
				
				if(rescode >=400) {
					System.out.println(activelinks.get(j).getAttribute("href") + " is a broken link");
				}
				else {
					System.out.println(activelinks.get(j).getAttribute("href") + " is a valid link");
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
