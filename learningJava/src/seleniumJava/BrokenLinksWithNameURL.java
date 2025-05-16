package seleniumJava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksWithNameURL {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://tutorialsninja.com/demo/");

		// get the links in the footer section only
		WebElement footersection = driver.findElement(By.tagName("footer"));
		List<WebElement> footerlinks = footersection.findElements(By.tagName("a"));

		// Number of links in footer
		System.out.println("Total Number of footer links is : " + footerlinks.size());

		for (WebElement footerlink : footerlinks) {
			String url = footerlink.getDomAttribute("href");
			String name = footerlink.getText().trim();

			// System.out.println(url + " : " + name);

			if (url == null || url.isEmpty() || url.startsWith("javascript")) {
				continue;
			}

			try {
				URL lurl = new URL(url);
				HttpURLConnection conn = (HttpURLConnection) lurl.openConnection();
				conn.setConnectTimeout(3000);
				conn.connect();
				
				int respCode = conn.getResponseCode();
				String respMsg = conn.getResponseMessage();
				
				if(respCode >=400) {
					System.out.println("Broken Links : " + name + url + respCode + respMsg);
				}
			} catch (IOException e) {
				System.out.println("Error checking the link" + name + url);
			}
		}

	}

}
