package learningJava;

public class CalculatorUsingFI{

	public static void main(String[] args) {
		
		
		functionalInterfaceExample sum = (a,b)->a+b;
		
		System.out.println(sum.calc(100, 2));

	}

}
