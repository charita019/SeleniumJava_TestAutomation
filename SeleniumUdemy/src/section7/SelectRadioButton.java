package section7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadioButton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@style='position: relative; z-index: 1;']/descendant::div[contains(@class,'1enofrn')]"));
		for(WebElement radioBtn : list) {			
			if(radioBtn.getText().equalsIgnoreCase("Students")) {
				radioBtn.click();
				break;
			}
		}
	}

}
