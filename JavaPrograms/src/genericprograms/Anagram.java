package genericprograms;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "Silent";
		String str2 = "abcdef";

		boolean res = checkAnagram(str1, str2);
		System.out.println(res);
	}

	public static boolean checkAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			System.out.println("Not Anagram");
		}

		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (char c : arr1) {
			if (hmap.containsKey(c)) {
				int count = hmap.get(c);
				hmap.put(c, count + 1);
			} else {
				hmap.put(c,1);
			}
		}

		for (char c : arr2) {
			if (hmap.containsKey(c)) {
				int count = hmap.get(c);
				hmap.put(c, count - 1);
			} else {
				hmap.put(c,1);
			}
		}

		for (var pair : hmap.entrySet()) {
			if (pair.getValue() != 0) {
				return false;
			}
		}
		return true;
	}
}
