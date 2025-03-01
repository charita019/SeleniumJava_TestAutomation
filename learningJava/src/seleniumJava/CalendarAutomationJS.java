package seleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarAutomationJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");

		String menutobeclicked = "Flight Bookings";

		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='YBLJE4']/span"));

		for (WebElement menu : menus) {
			if (menu.getText().equals(menutobeclicked)) {
				menu.click();
				break;
			}
		}
		String dateVal = "24 Feb, Mon";
		WebElement date = driver.findElement(By.xpath("//input[@class='v2VFa- k2khBy z2D4XG']"));
		Actions action = new Actions(driver);
		action.moveToElement(date).click().build().perform();

		selectDateByJs(driver, date, dateVal);
	}

	public static void selectDateByJs(WebDriver driver, WebElement element, String dateVal) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
	}
}
