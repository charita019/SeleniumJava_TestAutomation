package programs;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "sas";
		
		palindrome(str);

	}
	
	public static void palindrome(String str) {
		boolean isPalindrome = true;
		char[] arr = str.toCharArray();
		
		int left = 0;
		int right =arr.length-1;
		
		while(left<right) {
			if(arr[left]!=arr[right]) {
				isPalindrome = false;
			}
			left++;
			right--;
		}
		
		if(isPalindrome) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
