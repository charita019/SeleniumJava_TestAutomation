package seleniumJava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch browser
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); // enter url

		// get page title
		String title = driver.getTitle();
		System.out.println(title);

		// verify title is correct or not
		if (title.equals("Google")) {
			System.out.println("Correct Title");
		} else {
			System.out.println("Incorrect Title");
		}
		
		// check current url
		String currenttitle=driver.getCurrentUrl();
		System.out.println(currenttitle);
		
		//get page source
		//System.out.println(driver.getPageSource());
		
		//quit the browser
		driver.quit();
	}

}
