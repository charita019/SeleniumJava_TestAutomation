package exceptionHandlingConcept;

public class ThrowThrows {

	public static void main(String[] args) {
		try {
			int result = divide(10, 0);

			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}

	}

	public static int divide(int a, int b) {

		if (b == 0) {
			throw new ArithmeticException("Divide by 0");
		}
		
		System.out.println("Outside if block");

		return a / b;
	}
}
