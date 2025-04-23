package programs;

public class SumDigitsInNumber {

	public static void main(String[] args) {

		int number = 90;

		int sum = sumDigitsInNumber(number);
		if (sum == 0) {
			System.out.println("Sum is : " + sum + " Provide a number > 1");
		} else {
			System.out.println("Sum of the digits is : " + sum);
		}
	}

	public static int sumDigitsInNumber(int number) {
		int sum = 0, rem=0;

		if (number < 1) {
			return sum;
		}

		while (number > 0) {
			rem = number % 10;
			sum = sum + rem;
			number = number / 10;
		}
		return sum;
	}

}
