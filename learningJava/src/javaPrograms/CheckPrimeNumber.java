package javaPrograms;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int input = scanner.nextInt();
		scanner.close();

		boolean isPrime = checkPrime(input);

		if (isPrime) {
			System.out.println("Prime Number!");
		} else {
			System.out.println("Not Prime");
		}

	}

	public static boolean checkPrime(int input) {
		if (input == 1) {
			return false;
		}
		for (int i = 2; i < input; i++) {
			if(input % i == 0) {
				return false;
			}

		}
		return true;
	}

}
