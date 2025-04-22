package programs;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 123;

		reverseNumber(number);

	}

	public static void reverseNumber(int number) {

		System.out.println("Number before Reverse is : " + number);
		
		int rem = 0, rev = 0;
		while (number > 0) {
			rem = number % 10; //remainders
			rev = rev*10 + rem;
			number = number / 10; //number short
		}
		System.out.println("Reverse of the Number is : " + rev);

	}

}
