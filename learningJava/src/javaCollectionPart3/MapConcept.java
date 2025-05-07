package javaCollectionPart3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapConcept {

	public static void main(String[] args) {
		
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('A', 1);
		map.put('B', 2);
		map.put('C', 3);
		map.put('Y', 4);
		map.put('D', 5);
		map.put(' ', 6);
		map.put(' ', 7);
		
		System.out.println(map);
		System.out.println(map.containsValue(2));
		
		/*
		 * Travsering the map
		 */
		System.out.println("Traversing the hashmap :");
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
		map.remove('A');
		System.out.println("HashMap is : " + map);
		

		Map<Character,Integer> lmap = new LinkedHashMap<Character,Integer>();
		lmap.put('A', 1);
		lmap.put('B', 2);
		lmap.put('C', 3);
		lmap.put('Y', 4);
		lmap.put('D', 5);
		lmap.put(' ', 6);
		lmap.put(' ', 7);
		System.out.println("Linked HashMap is : " + lmap);
	}

}
