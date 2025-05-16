package seleniumJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSortValues {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/dropdown");

		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Select select = new Select(dropdown);
		
		List<String> optionsList = new ArrayList<String>();
		
		for(WebElement option : select.getOptions()) {
			optionsList.add(option.getText());
		}
		
		Collections.sort(optionsList);
		
		for(String ascsort : optionsList) {
			System.out.println(ascsort);
		}
		
		
		//Descending order
		List<String> revlist = new ArrayList<String>();
		
		for(int i = optionsList.size()-1;i>=0;i--) {
			revlist.add(optionsList.get(i));
		}
		
		for(String descsorted : revlist) {
			System.out.println(descsorted);
		}
		
	}

}
