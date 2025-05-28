package arrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " tO Do or Not to DO";
		//output : 
		/*
		 * to - 2
do - 2
or - 1
		 */

		
		printOccurrence(str);
	}
	
	public static void printOccurrence(String str) {
		
		String[] strarr = str.split(" ");
		HashMap<String, Integer> hmap = new HashMap<String,Integer>();
		
		
		for(int i = 0 ; i < strarr.length ; i ++) {
			
			String key = strarr[i].toLowerCase();
			
			if(hmap.containsKey(key)) {
				int count = hmap.get(key);
				hmap.put(key, count+1);
			}
			else{
				hmap.put(key, 1);
			}
		}
		
		
		for(Map.Entry<String, Integer> map : hmap.entrySet()) {
			System.out.println(map.getKey() + " : " + map.getValue());
		}
	}

}
