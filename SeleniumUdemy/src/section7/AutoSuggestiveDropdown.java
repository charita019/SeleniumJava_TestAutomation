package section7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ja");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

		System.out.println(list.size());
		for (WebElement option : list) {
			if (option.getText().equalsIgnoreCase("Japan")) {
				option.click();
				break;
			}
		}
	}
}
