package programs;

import java.util.HashSet;

public class FindFirstDuplicateElement {

	public static void main(String[] args) {

		// find first duplicate element in an array

		String str = "abrakadabra";

		String result = firstDuplicate(str);

		if (result != null) {
			System.out.println("First Duplicate element is : " + result);
		}
		else {
			System.out.println("No Duplicates found");
		}
	}

	public static String firstDuplicate(String str) {
		String[] s = str.split("");

		HashSet<String> hset = new HashSet<String>();

		for (int i = 0; i < s.length; i++) {
			String key = s[i].toLowerCase();
			if (hset.contains(key)) {
				return key;
			}

			else {
				hset.add(key);
			}
		}
		return null;

	}

}
