package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderAutomation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/horizontal_slider");

		driver.manage().window().maximize();

		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

		double currentVal = 0.0;
		double targetVal = 4.5;;
		
		int step = (int)(targetVal-currentVal);

		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, step, 0).build().perform();
		
	}

}