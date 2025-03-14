package section7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).click();
		int i=1;
		while(i<5) {
			driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}
		
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers-done-cta']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers'] //div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).getText());

	}

}
