package genericprograms;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		
		boolean result = palindrome(str);
		
		if(result) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palndrome");
		}

	}
	
	public static boolean palindrome(String str) {
		
		boolean isPalindrome = true;
		String[] s = str.split("");
		
		int left = 0;
		int right = str.length()-1;
		
		while(left<right) {
			if(!s[left].equals(s[right])) {
				isPalindrome=false;
			}
			left++;
			right--;
		}
		return isPalindrome;
	}

}
