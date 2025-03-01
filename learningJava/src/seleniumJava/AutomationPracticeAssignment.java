package seleniumJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticeAssignment {

	static WebDriver driver;

	public static void radioButtonExample(WebDriver driver, String btninput) {
		List<WebElement> list = driver.findElements(
				By.xpath("//div[@id='radio-btn-example']/fieldset//descendant::input[@name='radioButton']"));
		System.out.println("The size of the list is : " + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			// getText() does not return value for <input> element like radio buttons
			// Radio buttons typically don't have visible text inside them, so getText()
			// will return an empty string.
			// instead of getText() use getAttribute() with value attribute of radio button
			String btnnames = list.get(i).getAttribute("value");
			System.out.print(btnnames);
			if (btnnames.equalsIgnoreCase(btninput)) {
				list.get(i).click();
				break;
			}
		}
	}

	public static void DynamicSearchDropdown(WebDriver driver, String input , String Searchtext) {
		driver.findElement(By.id("autocomplete")).sendKeys(input);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@id='ui-id-1']/li//descendant::div[starts-with(@id,'ui-id')]"));
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().equalsIgnoreCase(Searchtext)) {
				list.get(i).click();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0,0);");
				break;
			}
		}
	}

	public static void SelectDropDown(WebDriver driver, Properties prop, String selectinput) {
		WebElement selectdropdown = driver.findElement(By.id(prop.getProperty("selectdrop_id")));
		Select selection = new Select(selectdropdown);
		selection.selectByVisibleText(selectinput);
	}

	public static void checkboxSelect(WebDriver driver, String checkboxinput) {
		List<WebElement> checklist = driver.findElements(By
				.xpath("//div[@id='checkbox-example']/fieldset//descendant::input[starts-with(@id,'checkBoxOption')]"));
		for (int i = 0; i < checklist.size(); i++) {
			String optns = checklist.get(i).getAttribute("value");
			System.out.println(optns);
			if (optns.equalsIgnoreCase(checkboxinput)) {
				checklist.get(i).click();
			}
		}

		// Chatgpt code
//		for (WebElement checkbox : checklist) {
//	        String optns = checkbox.getAttribute("value");
//	        System.out.println(optns);
//
//	        // Check if the checkbox value is in the list of inputs
//	        for (String input : checkboxinput) {
//	            if (optns.equalsIgnoreCase(input) && !checkbox.isSelected()) {
//	                checkbox.click();
//	            }
//	        }
//	    }
	}

	public static void switchWindowExample(WebDriver driver) {
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window Handle ID is : " + parentWindowId);
		System.out.println("Parent Window Title is : " + driver.getTitle());

		WebElement btn = driver.findElement(By.xpath("//button[@id='openwindow']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", btn);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			String childWindowId = it.next();
			if (!parentWindowId.equals(childWindowId)) {
				driver.switchTo().window(childWindowId);
				System.out.println("Page title after window switch is : " + driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowId);
	}

	public static void switchTab(WebDriver driver) {
		driver.findElement(By.id("opentab")).click();
		String Parentid = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			String childwindow = it.next();
			if (!Parentid.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println(
						"Page Title and url of switched tab is : " + driver.getTitle() + driver.getCurrentUrl());
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.close();
			}
		}
		driver.switchTo().window(Parentid);
	}

	public static void alertHandling(WebDriver driver, String Input) {
		driver.findElement(By.id("name")).sendKeys(Input);

		driver.findElement(By.id("alertbtn")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		if (alert.getText().contains(Input)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
		alert.accept();

		driver.findElement(By.id("name")).sendKeys(Input);
		driver.findElement(By.id("confirmbtn")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		if (alert2.getText().contains(Input)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
		alert2.accept();
	}

	public static void MouseHover(WebDriver driver, String hoverinputitem) {
		WebElement mhoverbtn = driver.findElement(By.id("mousehover"));
		Actions action = new Actions(driver);
		action.moveToElement(mhoverbtn).build().perform();
		List<WebElement> hoverlist = driver.findElements(By.xpath("//div[@class='mouse-hover']//descendant::a"));
		
		for(WebElement item : hoverlist) {
			if(item.getText().equalsIgnoreCase(hoverinputitem)){
				item.click();
			}	
		}
	}
	
	public static void webTableAutomation(WebDriver driver) {
		
	}

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			FileInputStream fp = new FileInputStream(
					"E:\\Charita\\Study\\Selenium\\SeleniumJava\\learningJava\\src\\seleniumJava\\config.properties");
			prop.load(fp);

			String url = prop.getProperty("automationpracticeurl");
			String browsername = prop.getProperty("browser");

			if (browsername.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", prop.getProperty("brwsrdriver"));
				driver = new ChromeDriver();

				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			} else if (browsername.equals("edge")) {
				System.setProperty("webdriver.edge.driver", prop.getProperty("edgebrwsrdriver"));
				driver = new EdgeDriver();

				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			} else {
				System.out.println("Browser not opened. Test is failed");
			}

			radioButtonExample(driver, prop.getProperty("radiobtn_input"));
			DynamicSearchDropdown(driver, prop.getProperty("dropdown_input"),prop.getProperty("searchtext_input"));
			SelectDropDown(driver, prop, prop.getProperty("select_input"));
			checkboxSelect(driver, prop.getProperty("checkinp"));
			switchWindowExample(driver);
			switchTab(driver);
			alertHandling(driver, "Charita");
			MouseHover(driver,"Reload");

		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
