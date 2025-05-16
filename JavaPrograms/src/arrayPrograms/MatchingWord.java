package arrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class MatchingWord {

	public static void main(String[] args) {

		String[] words = { "mass", "as", "hero", "superhero" };

		// Output : ["as","hero"]

		List<String> result = printSubstringWordInArray(words);
		System.out.println(result);
		

	}

	public static List<String> printSubstringWordInArray(String[] words) {
	
		List<String> substrings = new ArrayList<String>();
		for(int i =0; i<words.length;i++) {
			for(int j =0; j <words.length;j++) {
				if(!words[i].equalsIgnoreCase(words[j])) {
					if(words[i].contains(words[j])) {
						substrings.add(words[j]);
					}
				}
			}
		}
		return substrings;
	}

}
