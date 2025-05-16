package section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRMMainPageWithARelativeLocator {

	public static WebDriver driver = null;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.freecrm.com/");

		driver.manage().window().maximize();

		WebElement bodytext = driver.findElement(By.xpath("//h2[@class='txt-white']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(bodytext));
		getSignUpButton(bodytext).click();

	}

	public static WebElement getSignUpButton(WebElement bodytext) {

		return driver.findElement(RelativeLocator.with(By.tagName("a")).below(bodytext));
	}

}
