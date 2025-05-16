package genericprograms;

public class SumFibonacci {

	public static void main(String[] args) {
		
		
		int number = 5;
		sumfibonacci(number);

	}
	
	public static void sumfibonacci(int number) {
		
		int num1 = 0; 
		int num2 = 1;
		int num3 = 0;
		int sum=0;
		System.out.print(num1+ " " + num2);
		for(int i = 3; i<=number ; i++) {
			num3=num1+num2;
			System.out.print(num3);
			num1=num2;
			num2=num3;
		}
		
		System.out.println(sum);
	}

}
