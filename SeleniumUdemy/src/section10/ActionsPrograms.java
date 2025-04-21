package section10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPrograms {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement accountsList = driver.findElement(By.xpath("//a[@title='Login' and @class='_1TOQfO']"));
		
		WebElement searchbar = driver.findElement(By.cssSelector("input.Pke_EE"));
		Actions action = new Actions(driver);
				
		action.moveToElement(searchbar).click().keyDown(Keys.SHIFT).sendKeys("head").doubleClick().build().perform();
		
		action.moveToElement(accountsList).contextClick().build().perform();

	}

}
