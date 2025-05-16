package programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringManipulations {

	public static void main(String[] args) {

		String test = "aaabbtttpppp";
		// output = a3b2t3p4

		stringnumber(test);
	}

	public static void stringnumber(String test) {

		String[] starr = test.split("");
		
		Map<String,Integer> lhmap = new LinkedHashMap<String,Integer>();
		
		for(int i = 0; i<starr.length;i++) {
			if(lhmap.containsKey(starr[i])) {
				int count = lhmap.get(starr[i]);
				lhmap.put(starr[i],count+1);
			}else {
				lhmap.put(starr[i], 1);
			}
		}
		
		for(Map.Entry<String,Integer> m : lhmap.entrySet()) {
			System.out.print(m.getKey()+m.getValue());
		}
		
	}

}
