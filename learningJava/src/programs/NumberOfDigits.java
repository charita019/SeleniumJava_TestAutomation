package programs;

public class NumberOfDigits {

	public static void main(String[] args) {

		int number = -483749;
		//int number = 0;

		 int noofdigits = getNumberOfDigits(number);
		 System.out.println("Number of digits in the given number are : " +
		 noofdigits);

		int noofdigits2 = getNumberOfDigits_Method2(number);
		System.out.println("Number of digits in the given number are : " + noofdigits2);
	}

	public static int getNumberOfDigits(int number) {

		int noofdigits = 0;
		if (number < 1) {
			number = number * -1;
			noofdigits = Integer.toString(number).length();
		}

		return noofdigits;
	}

	public static int getNumberOfDigits_Method2(int number) {

		int noofdigits = 0;
		if (number == 0) {
			noofdigits = 1;
			return noofdigits;
		}
		if (number < 1) {
			number = number * -1;
		}
		while (number > 0) {
			number = number / 10;
			noofdigits = noofdigits + 1;
		}
		return noofdigits;
	}
}
