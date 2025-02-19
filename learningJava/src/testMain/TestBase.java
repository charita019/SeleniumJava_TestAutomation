package testMain;

public class TestBase {

	// method overloading - same method name ; different params
	//JVM - search with String[] args - should be public, static and void. 
	//Not found - program will not be executed

	public static void main(String[] args) {
		System.out.println("Main Method 1");
		
		//explicitly call other main methods within the String[] args main method
		main(10);
		main(10,20);
		main("Testing");
	}

	public static void main(int a) {
		System.out.println("Main Method 2");
	}

	public static void main(int a, int b) {
		System.out.println("Main Method 3");
	}

	public static void main(String args) {
		System.out.println("Main Method 4");
	}

}
