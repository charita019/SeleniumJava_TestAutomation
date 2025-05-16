package arrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindElementInArray {

	public static void main(String[] args) {

		int[] numarray = { 1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9 };
		int target = 6;
		List<Integer> result = findElements(numarray, target);
		System.out.println("Index of " + target + " is :" + result);
	}

	public static List<Integer> findElements(int[] numarray, int target) {

//		if (numarray.length < 1) {
//			return -1;
//		}

		List<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < numarray.length; i++) {

			if (numarray[i] == target) {
				al.add(i);
			}
		}
		
		return al;
	}
}
