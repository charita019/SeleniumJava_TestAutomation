//Duplicate occurrence and print duplicates and their count

package programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateOccurrence {

	public static void countDuplicates(String input) {
		String[] arrinput = input.split(" ");

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();

		for (int i = 0; i < arrinput.length; i++) {
			String key = arrinput[i].toLowerCase();
			if (!key.equals(" ")) {
				if (hmap.containsKey(key)) {
					int counter = hmap.get(key);
					hmap.put(key, counter + 1);
				} else {
					hmap.put(key, 1);
				}
			}
		}

		for (Map.Entry<String, Integer> duplicatesCount : hmap.entrySet()) {
			if (duplicatesCount.getValue() > 1) {
				System.out.println(duplicatesCount.getKey() + " = " + duplicatesCount.getValue());
			}
			
			//for Uniques
//			if(duplicatesCount.getValue()==1) {
//				System.out.println(duplicatesCount.getKey() + " =>" + duplicatesCount.getValue() );
//			}
		}
	}

	public static void main(String[] args) {

		String input = "Geeks for geeks is for ultimate geeks";

		countDuplicates(input);

	}

}
