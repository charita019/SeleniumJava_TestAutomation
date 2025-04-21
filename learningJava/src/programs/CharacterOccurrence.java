//Program to print occurrence of each character in string

package programs;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {

	public static void main(String[] args) {
		
		String input = "Geeks for geeks is for the geeks only";
		
		characterOccurrence(input);

	}
	
	public static void characterOccurrence(String input) {
		String[] charArray = input.split("");
		
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		for(int i = 0; i < charArray.length; i++) {
			String key = charArray[i].toLowerCase();
			
			if(!key.equals(" ")) {
				if(hmap.containsKey(key)) {
					int count = hmap.get(key);
					hmap.put(key, count+1);
				}
				else {
					hmap.put(key, 1);
				}
			}
		}
		
		//Print each character and it's count
		for( Map.Entry<String,Integer> charOccur : hmap.entrySet()) {
			System.out.println(charOccur.getKey() + " = " + charOccur.getValue());
		}
		
		System.out.println("******Print Duplicates and their Counts******");
		for(Map.Entry<String, Integer> charOccurs : hmap.entrySet()) {
			//if duplicates only
			if(charOccurs.getValue()>1) { // for uniques - (charOccurs.getValue() == 1)
				System.out.println(charOccurs.getKey() + " = " + charOccurs.getValue());
				
			}
		}
	}

}
