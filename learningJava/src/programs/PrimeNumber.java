package programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int number = scanner.nextInt();
		
		scanner.close();
		
		boolean result = primeNumberCheck(number);
		
		if(result) {
			System.out.println(number + " is prime");
		}
		else {
			System.out.println(number + " is not prime");
		}

	}
	
	public static boolean primeNumberCheck(int number) {
		
		boolean isPrime = true;
		
		if(number <= 1) {
			isPrime = false;
			return isPrime;
		}
		for(int i = 2; i<number ; i++) {
			if(number%i==0) {
				isPrime = false;
				return isPrime;
			}
		}
		
		return isPrime;
	}
}
