package exceptionHandlingConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CheckedExceptions {

	private static Properties prop;

	public static void main(String[] args) {

		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"E:\\Charita\\Study\\GitSelenium\\SeleniumJava_TestAutomation\\learningJava\\src\\exceptionHandlingConcept\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		String browsername = prop.getProperty("chrome");
		System.out.println(browsername);
		arithmeticOperation();
		arrayIndexAccess();
		nullHandling();
	}

	public static void arithmeticOperation() {
		try {
			int num1 = 10;
			int res = num1 / 0;
			System.out.println(res);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " Cannot divide by 0");
		}
	}

	public static void arrayIndexAccess() {
		int[] arr = { 1, 3, 5, 6 };
		try {
			System.out.println(arr[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println("Trying to access index which does not exist.!!");
			System.out.println(e.getMessage());
		}
	}
	
	

	public static void nullHandling() {
		String name = null;
		try {
				System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
