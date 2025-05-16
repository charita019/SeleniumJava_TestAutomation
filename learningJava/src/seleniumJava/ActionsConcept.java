package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/context_menu");
//		driver.manage().window().maximize();
//		Actions action = new Actions(driver);
//		
//		WebElement element = driver.findElement(By.id("hot-spot"));
//		
//		action.moveToElement(element).contextClick().build().perform();
//		
//		driver.switchTo().alert().accept();
//		
//		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/droppable.php");
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//		
//		action.dragAndDrop(drag, drop).build().perform();
		
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.browserstack.com/");
//		driver.manage().window().maximize();
//		
//		WebElement menuelement = driver.findElement(By.id("developers-dd-menu"));
//		
//		action.moveToElement(menuelement).click(driver.findElement(By.id("Documentation"))).build().perform();
//		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		WebElement name = driver.findElement(By.cssSelector("#input-firstname"));
		
		name.sendKeys("Ron");
		
		
		
		
		
	}

}
