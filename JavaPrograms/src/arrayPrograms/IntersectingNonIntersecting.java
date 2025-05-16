package arrayPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectingNonIntersecting {

	public static void main(String[] args) {

		int[] a1 = { 1, 4, 6, 7 };
		int[] a2 = { 1, 4, 8, 9 };
	
		printintersectingvalues(a1, a2);
		printnonintersectingvalues(a1, a2);
	}

	public static void printintersectingvalues(int[] a1, int[] a2) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a1.length ; i++) {
			for (int j = 0; j < a2.length ; j++) {
				if (a1[i] == a2[j]) {
					set.add(a1[i]);
				}
			}
		}
		System.out.println("Intersecting elements are :");
		System.out.println(set);
	}

	public static void printnonintersectingvalues(int[] a1, int[] a2) {
		
		Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i<a1.length; i++) {
			hmap.put(a1[i],1);
		}
		
		for(int i = 0 ; i<a2.length; i++) {
			if(hmap.containsKey(a2[i])) {
				int count = hmap.get(a2[i]);
				hmap.put(a2[i], count+1);
			}
			else {
				hmap.put(a2[i], 1);
			}
		}
		
		System.out.println("Not Common elements are :");
		for(Map.Entry<Integer, Integer> map : hmap.entrySet()) {
			if(map.getValue()==1) {
				System.out.println(map.getKey());
			}
		}
	}
	

}
