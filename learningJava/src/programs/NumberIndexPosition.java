package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberIndexPosition {

	public static void elementIndex(int[] array, int input) {
		ArrayList<Integer> counts = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			if (array[i] == input) {
				counts.add(i);
			}
		}
		if (counts.size() == 0) {
			System.out.println("Element not found !!!");
		} else {
			System.out.println(counts);
		}

	}

	public static void main(String[] args) {

		int[] array = { 1, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9, 6, 7, 0, 6 };

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an element to search : ");
		int input = scanner.nextInt();
		scanner.close();
		// 1. when user searches for element, should display index number where element
		// is found
		// 2. If element repeated - should display all indices
		// 3. if not present - display element not found

		elementIndex(array, input);

	}

}
