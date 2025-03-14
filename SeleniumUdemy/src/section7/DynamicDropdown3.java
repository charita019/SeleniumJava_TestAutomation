package section7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicDropdown3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.spicejet.com/");

		WebElement fromField = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/descendant::div[contains(text(),'From')]"));
		Actions action = new Actions(driver);
		action.moveToElement(fromField).click().build().perform();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-testid='to-testID-origin']/div/descendant::div[@class='css-76zvg2 r-1xedbs3 r-ubezar']"));
		System.out.println("Number of suggestions : " + list.size());
	}

}
