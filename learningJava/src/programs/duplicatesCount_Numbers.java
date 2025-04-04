package programs;

import java.util.HashMap;
import java.util.Map;

public class duplicatesCount_Numbers {

	public static void countNumberDuplicates(int[] numbers) {
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (hmap.containsKey(numbers[i])) {
				int counter = hmap.get(numbers[i]);
				hmap.put(numbers[i], counter + 1);
			} else {
				hmap.put(numbers[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> duplicateNumbers : hmap.entrySet()) {
			if (duplicateNumbers.getValue() > 1) {
				System.out.println(duplicateNumbers.getKey() + " => " + duplicateNumbers.getValue());
			}
			
			//For Uniques
			if(duplicateNumbers.getValue()==1) {
				System.out.println(duplicateNumbers.getKey() + " => " + duplicateNumbers.getValue() );
			}
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 10, 10, 20, 90, 80, 20, 80};

		countNumberDuplicates(numbers);

	}

}
