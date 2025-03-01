package seleniumJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarAutomation2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		String date = "Feb/28/2025";

		String dateArr[] = date.split("/");

		String month = dateArr[0];
		String day = dateArr[1];
		String year = dateArr[2];

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement thirddate = driver.findElement(By.id("third_date_picker"));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(thirddate));
		js.executeScript("window.scrollBy(0,100);");
		Actions action = new Actions(driver);
		action.moveToElement(thirddate).click().build().perform();

		Select select = new Select(driver.findElement(By.cssSelector(".ui-datepicker-month")));
		select.selectByVisibleText(month);
		Select select1 = new Select(driver.findElement(By.className("ui-datepicker-year")));
		select1.selectByVisibleText(year);

		String before_xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[";
		String after_xpath = "]/td[";

		final int totalweekDays = 7;
		String dayVal = null;
		boolean flag = false;
		for (int rowNum = 1; rowNum <= 6; rowNum++) {
			for (int colNum = 1; colNum <= totalweekDays; colNum++) {
				try {

					dayVal = driver.findElement(By.xpath(before_xpath + rowNum + after_xpath + colNum + "]")).getText();
				} catch (NoSuchElementException e) {
					System.out.println("Please enter a correct date value");
					flag = false;
					break;
				}
				// System.out.println(dayVal);
				if (dayVal.equals(day)) {
					driver.findElement(By.xpath(before_xpath + rowNum + after_xpath + colNum + "]")).click();
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
	}
}
