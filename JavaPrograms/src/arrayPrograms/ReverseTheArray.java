//

package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		//Integer[] a = { 10, 4, 5, 2, 3, 6, 1, 3, 6 };
		Integer[] a = { 27, 14, 25, 10, 19, 23, 29, 15, 15, 19 };
		//Integer[] a = {1,2,3,4,5,6};
		//Integer[] a = {10,9,8,7,6};
		
		/*
		 * 27 14 25 19 15 15 29 23 19 10  
		 * 27 14 25 15 19 19 15 15 29 23 19 10 
		 */
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(a));
		int pos = 3;
		reverseArray(arr, pos);
	}

	/*public static void reverseArray(ArrayList<Integer> arr, int m) {
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		ArrayList<Integer> revarr = new ArrayList<Integer>();
		for (int i = 0; i < arr.size(); i++) {
			if (i > m) {
				arr2.add(arr.get(i));
			}
		}
		for (int i = arr2.size() - 1; i >= 0; i--) {
			revarr.add(arr2.get(i));
		}

		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0 ; i<=m ; i++) {
			result.add(arr.get(i));
		}
		for(int i = 0 ; i <revarr.size();i++) {
			result.add(revarr.get(i));
		}
		System.out.println(result);
//		for (int i = 0; i < arr.size(); i++) {
//			if (i == arr2.size()) {
//				break;
//			}
//			if (arr.contains(arr2.get(i))) {
//				
//				arr.remove(arr2.get(i));
//				System.out.println("Org Array after remove elements : " + arr);
//			}
//		}
//		arr.addAll(revarr);
	}*/
	
	public static void reverseArray(ArrayList<Integer> arr, int m) {
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		for(int i = 0; i<arr.size();i++) {
			if(i<=m) {
				arr2.add(arr.get(i));
			}
			else {
				arr3.add(arr.get(i));
			}
		}
		ArrayList<Integer> rev = new ArrayList<Integer>();
		for(int i = arr3.size()-1 ; i>=0;i--) {
			rev.add(arr3.get(i));
		}
		arr2.addAll(rev);


		
		System.out.println(arr);

	}
}
