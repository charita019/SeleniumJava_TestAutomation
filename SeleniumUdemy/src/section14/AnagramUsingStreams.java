package section14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class AnagramUsingStreams {

	@Test
	public void anagram() {
		String s1 = "rat";
		String s2 = "art";

		String[] str1 = s1.split("");
		String[] str2 = s2.split("");

		ArrayList<String> al1 = new ArrayList<String>(Arrays.asList(str1));
		ArrayList<String> al2 = new ArrayList<String>(Arrays.asList(str2));

		
		List<String> ls1 = al1.stream().sorted().collect(Collectors.toList());
		List<String> ls2 = al2.stream().sorted().collect(Collectors.toList());
		
		if(ls1.equals(ls2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not");
		}
		
	}

}
