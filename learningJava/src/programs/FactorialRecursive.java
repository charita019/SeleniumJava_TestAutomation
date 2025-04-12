package programs;

public class FactorialRecursive {

	public static void main(String[] args) {
		
		
		int num = 5;
		
		int result = factorial(num);
		System.out.println(result);

	}
	
	public static int factorial(int num) {
		if(num>=1) {
			return factorial(num-1) * num;
		}
		else
			return 1;
		
	}

}
