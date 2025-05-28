package seleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableAutomation {

	public static void main(String[] args) {

		webtableautoamtion();

	}

	public static void webtableautoamtion() {

		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php?#");
//		driver.manage().window().maximize();
//		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1000));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("a[@title='edit']")));
//		driver.findElement(By.xpath("//td[contains(text(),'Vega')]/parent::tr//descendant::td//a[@title='edit']")).click();

		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		driver.manage().window().maximize();

		// Total Headers in a table
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));

		// System.out.println("Total Count of all the headers : " + headers.size());

		Assert.assertEquals(headers.size(), 5, "Column count mismatch");

		boolean isPresent = false;
		for (WebElement headername : headers) {
			String headernames = headername.getText().trim();
			if (headernames.contains("Country")) {
				isPresent = true;
				break;
			}
		}
		Assert.assertTrue(isPresent, "Header is not present");

		// Total rows in table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

		Assert.assertEquals(rows.size(), 7, "Row Count mismatch");

		// Total Table Data
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']/descendant::td"));

		boolean dataStatus = false;

		for (WebElement data : allData) {
			String cellData = data.getText();
			if (cellData.contains("Amazon")) {
				dataStatus = true;
				break;
			}
		}
		Assert.assertTrue(dataStatus);

		driver.findElement(By.xpath(
				"//td[contains(text(),'Selenium')]//preceding-sibling::td//input"))
				.click();
		driver.findElement(By.xpath("//td[contains(text(),'Ola')]//following-sibling::td//a")).click();
		
		String title = driver.getCurrentUrl();
		
		Assert.assertEquals(title, "https://www.olacabs.com/" , "Not loading the correct page");
		//driver.quit();
	}

}
