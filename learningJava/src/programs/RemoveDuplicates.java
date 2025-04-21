package programs;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String input = "My name is Mojo Jojo";
		
		removeDuplicates(input);

	}
	
	public static void removeDuplicates(String input) {
		
		String[] ar = input.split("");
		LinkedHashSet<String> hset = new LinkedHashSet<String>();
		for(int i = 0;i<ar.length ; i++) {
			String key = ar[i].toLowerCase();
			
			if(!key.equals(" ")) {
				if(!hset.contains(key)) {
					hset.add(key);
				}
			}
		}
		
		System.out.println(hset);
		
	}

}
