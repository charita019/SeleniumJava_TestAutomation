//Program to reverse each word in its position
package programs;

import java.util.ArrayList;

public class ReverseWordInPosition {

	public static void main(String[] args) {

		String input = "Java is good programming Language";
		// output = avaJ si doog gnimmargorp egaugnaL

		reverseEachWord(input);

	}

	public static String reverse(String strArr) {
		
//		char[] ch = strArr.toCharArray();
//		char[] revarr = new char[strArr.length()];
//		for(int i = ch.length-1;i>=0;i--) {
//			revarr[i]+=ch[i];
//		}
//		return String.valueOf(revarr);
		
		String[] ar = strArr.split("");
		String rev = " ";
		for(int i = ar.length-1;i>=0;i--) {
			rev+=ar[i];
		}
		return rev;
	}

	public static void reverseEachWord(String input) {

		ArrayList<String> resultarr = new ArrayList<String>();
		String[] strArr = input.split(" ");
		
		for(int i = 0; i<strArr.length;i++) {
		String result = reverse(strArr[i]);
		resultarr.add(result);
		}
		
		System.out.println(String.join(" ", resultarr));
	}

}
