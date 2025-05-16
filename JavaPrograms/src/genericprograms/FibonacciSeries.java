package genericprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int number = 10;
		fibonacci(number);

	}
	
	public static void fibonacci(int number) {
		//011235813
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		System.out.println("Fibonacci Number Series upto " + number + " is :");
		System.out.print(num1 + " " + num2 + " ");
		for(int i = 3; i<=number ; i++) {
			
			num3=num1+num2;
			System.out.print(num3 + " ");
			
			num1=num2;
			num2=num3;
		}
	}

}
