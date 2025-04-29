package section14;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebTableSortUsingStreams {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/practice-project");

		driver.findElement(By.id("name")).sendKeys("Charita Sharma");
		driver.findElement(By.id("email")).sendKeys("charitasharma1901@gmail.com");
		driver.findElement(By.id("form-submit")).click();

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='projects-item']/p"),
				"Web Automation Students (Selenium, Protractor & Cypress) can use below links for Practice"));
		driver.findElement(By.xpath("//a[contains(text(),' - 1')]")).click();

		wait.until(ExpectedConditions.urlContains("seleniumPractise"));

		driver.findElement(By.linkText("Top Deals")).click();

		String parentwindowid = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			String childwindowid = it.next();
			if (!parentwindowid.equals(childwindowid)) {
				driver.switchTo().window(childwindowid);

				driver.findElement(
						By.xpath("//th[@role='columnheader']/descendant::span[contains(text(),'Veg/fruit')]")).click();

				List<WebElement> webtablelist = driver
						.findElements(By.xpath("//table[@class='table table-bordered']/descendant::tbody/tr/td[1]"));

				List<String> originalList = webtablelist.stream().map(s -> s.getText()).collect(Collectors.toList());
				System.out.println(originalList);
				List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
				System.out.println(sortedList);

				Assert.assertTrue(originalList.equals(sortedList), "List is not same");
				List<String> price;
				do {

					List<WebElement> rows = driver.findElements(
							By.xpath("//table[@class='table table-bordered']/descendant::tbody/tr/td[1]"));

					price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getPrice(s))
							.collect(Collectors.toList());

					price.forEach(a -> System.out.println(a));

					// Pagination Implementation
					if (price.size() < 1) {
						driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
					}

				} while (price.size() < 1);

				// Test Filters
				/*String elementtoSearch = "apple";
				driver.findElement(By.id("search-field")).sendKeys(elementtoSearch);

				try {

					Thread.sleep(2000); 

				} catch (InterruptedException e) {

					e.printStackTrace();

				}

				List<WebElement> nameslist = driver.findElements(By.xpath("//tr/td[1]"));

				List<WebElement> filteredlist = nameslist.stream()
						.filter(s -> s.getText().equalsIgnoreCase(elementtoSearch)).collect(Collectors.toList());

				System.out.println("Total items :" + nameslist.size());
				System.out.println("Filtered Items :" + filteredlist.size());

				//Assert.assertEquals(nameslist.size(), filteredlist.size());*/
			}
		}

	}

	private static String getPrice(WebElement s) {

		String priceVal = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceVal;
	}

}
