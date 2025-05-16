//Find DUPLICATES without Using SET

package arrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesWithoutSet {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 4, 2, 3, 2, 3, 4, 5 };

		findDuplicates(arr);

	}

	public static void findDuplicates(int[] arr) {

		List<Integer> al = new ArrayList<Integer>();
		List<Integer> al2 = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					al.add(arr[i]);
				}
			}
		}

		for (int i = 0; i < al.size(); i++) {
			if (!al2.contains(al.get(i))) {
				al2.add(al.get(i));
			}
		}

		System.out.println(al2);
	}

}
