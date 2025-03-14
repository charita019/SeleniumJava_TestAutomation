//Program to count the number of vowels and consonants in the string
package javaPrograms;

public class VowelConsonant {

	static String str = "This is a sample aeiou";

	public static void countVowelConsonant(String str) {
		String[] arrStr = str.split("");

		int len = arrStr.length;
		int vowelCount = 0, consonantCount = 0;

		for (int i = 0; i < len; i++) {
			if (arrStr[i].equals(" ")) {
				continue;
			} else if (arrStr[i].equals("a") || arrStr[i].equals("e") || arrStr[i].equals("i") || arrStr[i].equals("o")
					|| arrStr[i].equals("u")) {
				vowelCount++;
			} else {
				consonantCount++;
			}
		}
		System.out.println("Vowel Count is : " + vowelCount + " " + "Consonant Count is : " + consonantCount);
	}

	public static void main(String[] args) {
		countVowelConsonant(str);

	}

}
