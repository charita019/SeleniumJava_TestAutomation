package section6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingParentXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Charita\\Study\\Selenium\\SeleniumJava\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// using descendant
		driver.findElement(By.xpath(
				"//header[@class='jumbotron text-center header_style']/div//descendant::button[contains(text(),'Practice')]"));

		// using following sibling
		String loginBtnTxt = driver.findElement(By.xpath(
				"//header[@class='jumbotron text-center header_style']/div//following-sibling::button[contains(text(),'Login')]"))
				.getText();
		System.out.println(loginBtnTxt);

		// traverse to parent from Child tag
		driver.findElement(By.xpath(
				"//header[@class='jumbotron text-center header_style']/div//following-sibling::button[contains(text(),'Login')]//parent::div"));

		// traverse to parent then to child
		driver.findElement(By.xpath(
				"//header[@class='jumbotron text-center header_style']/div//following-sibling::button[contains(text(),'Login')]/parent::div/parent::header/a/following-sibling::div"));
	}

}
