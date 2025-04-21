package programs;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String s1, String s2) {

		String str1 = s1.replace("\\s", "");
		String str2 = s2.replace("\\s", "");
		if (str1.length() != str2.length()) {
			return false;
		} else {
			char[] ar1 = str1.toLowerCase().toCharArray();
			char[] ar2 = str2.toLowerCase().toCharArray();
			
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			
			return Arrays.equals(ar1, ar2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram("listent","silent"));
	}

}
