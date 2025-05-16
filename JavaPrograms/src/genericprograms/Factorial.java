package genericprograms;

public class Factorial {

	public static void main(String[] args) {
		
		int number = 5;
		
		int result = factorial(number);
		System.out.println("Factorial of the number is : " + result);

	}
	
	public static int factorial(int number) {
		
		int fact = 1;
		
		for(int i = number ; i>=1; i--) {
			fact = fact * i ;
		}
		
		return fact ;
	}

}
