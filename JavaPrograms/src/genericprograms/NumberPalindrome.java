package genericprograms;

public class NumberPalindrome {

	public static void main(String[] args) {

		int number = 3443;

		int result = palindrome(number);
		
		if(result == number) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

	public static int palindrome(int number) {

		int temp = number;
		int rem, sum = 0;
		// 3443
		while (temp > 0) {
			rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10;
		}
		return sum;
	}

}
