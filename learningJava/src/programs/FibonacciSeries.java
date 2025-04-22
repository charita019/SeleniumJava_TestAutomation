package programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for the series :");
		
		int number = scanner.nextInt();
		
		scanner.close();
		
		fibonacciSeries(number);

	}
	
	public static void fibonacciSeries(int number) {
		
		//0 1 1 2 3 5 8 13 21 34
		int num1= 0, num2=1;
		int num3=0;
		
		System.out.print(num1 + " " + num2 + " ");
		for(int i = 3 ; i<=number ; i++) {
			
			num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1=num2;
			num2=num3;
		}
	}
}
