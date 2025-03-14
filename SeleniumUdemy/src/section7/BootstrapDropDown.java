package section7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

	public void selectFromDropdown(WebDriver driver, String valueToSelect) {
		
		driver.findElement(By.id("dropdownMenuButton")).click();
		
		List<WebElement> ls = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
		for(WebElement option : ls) {
			if(option.getText().equalsIgnoreCase(valueToSelect)) {
				option.click();
				break;
			}
		}
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		BootstrapDropDown bdropdown = new BootstrapDropDown();
		bdropdown.selectFromDropdown(driver, "Another action");
		
		

	}

}
