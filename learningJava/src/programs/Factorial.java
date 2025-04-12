package programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = scanner.nextInt();
		scanner.close();
		
		int result = factorial(number);
		System.out.println("Factorial of " + number + " is : " + result);

	}
	
	public static int factorial(int number) {
		int fact = 1;
		for(int i = number ; i>=1; i--) {
			fact = fact * i ;
		}
		
		return fact;
	}

}
