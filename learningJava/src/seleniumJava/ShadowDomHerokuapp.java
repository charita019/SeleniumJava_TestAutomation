package seleniumJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ShadowDomHerokuapp {
	static WebDriver driver;

	public static void main(String[] args) {

		try {
			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://the-internet.herokuapp.com/shadowdom");
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));

		String actualHeadingText = driver.findElement(By.tagName("h1")).getText();
		String expectedHeadingText = "Simple template";

		Assert.assertEquals(expectedHeadingText, actualHeadingText);

		WebElement shadowHost = driver.findElement(By.cssSelector("my-paragraph"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();

		// WebElement content = shadowRoot.findElement(By.cssSelector("my-paragraph
		// slot"));
		// String text = content.getText();

//		Assert.assertEquals(text, "Let's have some different text!");
	}

}
