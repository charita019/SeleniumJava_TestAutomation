package seleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BootstrapDropboxHandle {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		options.addArguments("--window-size=1400,800");
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(1,1000);");

		WebElement bootdrop = driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		js.executeScript("arguments[0].click();", bootdrop);

		List<WebElement> list = driver.findElements(
				By.xpath("//div[contains(@class,'dropdown-menu show') and @aria-labelledby='dropdownMenuButton']//a"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("Action")) {
				list.get(i).click();
			}
		}

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=14.0_2#");
		driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle') and contains(text(),'Bootstrap')]"))
				.click();

		List<WebElement> list2 = driver
				.findElements(By.xpath("//li[@class='dropdown open']//ul[@class='dropdown-menu']//li//a"));
		System.out.println(list2.size());

		for (int j = 0; j < list2.size(); j++) {
			System.out.println(list2.get(j).getText());
			if (list2.get(j).getText().equals("Carousel")) {
				list2.get(j).click();
				break;
			}
		}

		driver.get("https://jqueryui.com/selectmenu/");

		driver.switchTo().frame(0);

		WebElement speedselect = driver.findElement(By.xpath("//span[@id='speed-button']"));
		Actions action = new Actions(driver);
		action.moveToElement(speedselect).click().build().perform();

		List<WebElement> list3 = driver.findElements(By.xpath("//ul[@id='speed-menu']//li"));
		System.out.println(list3.size());

		for (int k = 0; k < list3.size(); k++) {
			System.out.println(list3.get(k).getText());
			if (list3.get(k).getText().equals("Fast")) {
				list3.get(k).click();
				break;
			}
		}

		driver.findElement(By.xpath("//span[@id='files-button']")).click();
		List<WebElement> list4 = driver.findElements(By.xpath("//ul[@id='files-menu']//li//div"));
		for (int l = 0; l < list4.size(); l++) {
			if (list4.get(l).getText().equals("ui.jQuery.js")) {
				list4.get(l).click();
				break;
			}
		}

		try {
			WebElement selectnum = driver.findElement(By.xpath("//span[@id='number-button']"));
			selectnum.click();
			List<WebElement> list5 = driver.findElements(By.xpath("//ul[@id='number-menu']//li//div"));
			if (list5.isEmpty()) {
				System.out.println("Dropdown is empty");
				return;
			}
			System.out.println(list5.size());
			boolean isOptionFound = false;
			for (int m = 0; m < list5.size(); m++) {
				System.out.println(list5.get(m).getText());
				if (list5.get(m).getText().equals("15")) {
					list5.get(m).click();
					isOptionFound = true;
					break;
				}
			}
			if (!isOptionFound) {
				System.out.println("Option not available in the dropdown");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Dropdown or option is not found : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unexpected error occurred : " + e.getMessage());
		}

		WebElement salutationselect = driver.findElement(By.xpath("//span[@id='salutation-button']"));
		salutationselect.click();
		List<WebElement> list6 = driver.findElements(By.xpath("//ul[@id='salutation-menu']//li/div"));
		for (int n = 0; n < list6.size(); n++) {
			if (list6.get(n).getText().equals("Prof.")) {
				list6.get(n).click();
				break;
			}
		}
	}
}
