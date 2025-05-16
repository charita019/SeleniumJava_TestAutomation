package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ShadowDOM {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
		
		driver.manage().window().maximize();
		
		WebElement shadowHost = driver.findElement(By.cssSelector(".smart-ui-component"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		
		WebElement txt = shadowRoot.findElement(By.cssSelector(".smart-element .smart-menu-main-container .smart-element"));
		String filetext = txt.getAttribute("label");
		
		Assert.assertEquals(filetext, "File");
		
		txt.click();
		
		WebElement newtxt = shadowRoot.findElement(By.cssSelector(".smart-menu-drop-down .smart-menu-item-container .smart-element"));
		
		String newoptiontxt = newtxt.getAttribute("label");
		Assert.assertEquals(newoptiontxt, "New");
		
	}

}
