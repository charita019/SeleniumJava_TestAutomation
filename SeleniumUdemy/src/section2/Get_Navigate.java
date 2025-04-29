package section2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Get_Navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);

		// Get Method
		driver.get("https://rahulshettyacademy.com/");
		String drivertitle = driver.getTitle();
		System.out.println("Page title using selenium driver" + drivertitle);

		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String jstitle = js.executeScript("return document.title;").toString();
		System.out.println("Page title using JSExecutor : " + jstitle);
		
		
		driver.quit();

	}

}
