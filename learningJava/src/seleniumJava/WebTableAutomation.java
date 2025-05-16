package seleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
		
	}

}
