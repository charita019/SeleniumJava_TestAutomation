package programs;

public class NumberPalindrome {

	public static void main(String[] args) {

		int number = 121;
		
		int result = numberPalindrome(number);

		if (number == result) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

	public static int numberPalindrome(int number) {

		int temp = number;
		int rem, rev = 0;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		return rev;
	}
}
