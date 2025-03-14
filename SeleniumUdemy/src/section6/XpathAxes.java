package section6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		System.out.println(driver.findElement(By.xpath("(//tr[@class='usr_acn'])[last()]")).getText());
	}

}
