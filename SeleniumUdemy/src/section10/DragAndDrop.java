package section10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement box1 = driver.findElement(By.id("column-a"));
		WebElement box2 = driver.findElement(By.id("column-b"));
		Actions action = new Actions(driver);
		
		//action.clickAndHold(box1).moveToElement(box2).release().build().perform();
		action.dragAndDrop(box1, box2).build().perform();
		
	}

}
