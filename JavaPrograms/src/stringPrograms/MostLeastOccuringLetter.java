package stringPrograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostLeastOccuringLetter {

	public static void main(String[] args) {
		String str = "aabbbjjjjelkkkkk";
		printMostLeastOccuringCharacter(str);
	}
	
	public static void printMostLeastOccuringCharacter(String str) {
		
		String[] sarr = str.split("");
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		for(int i = 0; i<sarr.length ; i++) {
			String key = sarr[i].toLowerCase();
			if(key.contains(" ")) {
				continue;
			}
			if(hmap.containsKey(key)) {
				int counter = hmap.get(key);
				hmap.put(key,counter+1);
			}else {
				hmap.put(key, 1);
			}
		}
		
		System.out.println(hmap.values());
		int maxValue = Collections.max(hmap.values());
		System.out.println("Maximum Value in hashmap is : " + maxValue);
		
		for(Map.Entry<String,Integer> entry : hmap.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("Least " + entry.getKey());
			}
			
			if(entry.getValue()==maxValue) {
				System.out.println("Most " + entry.getKey());
			}
		}
	}

}
