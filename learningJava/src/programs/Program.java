package programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		String str = "AABBBCCCCaaaa";
		//A - 2 ; B - 3; C -4 ; a-4
		
		program(str);
	}
	
	public static void program(String str) {
		String[] st = str.split("");
		Map<String,Integer> hmap = new LinkedHashMap<String,Integer>();
		for(int i = 0;i<st.length; i++) {
			if(hmap.containsKey(st[i])) {
				int count = hmap.get(st[i]);
				hmap.put(st[i], count+1);
			}
			else {
				hmap.put(st[i], 1);
			}
		}
		
		for(Map.Entry<String, Integer> counts : hmap.entrySet()) {
			System.out.println(counts.getKey() + " " + counts.getValue());
		}
	}

}
