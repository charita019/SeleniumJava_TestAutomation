package section14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

	// Count the number of names starting with alphabet 'A' in list

	@Test(enabled = false)
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhira");
		names.add("Jatin");
		names.add("Palak");
		names.add("Anshika");
		names.add("Anaconda");

		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test (enabled = false)
	public void streamFilter() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhira");
		names.add("Jatin");
		names.add("Palak");
		names.add("An");
		names.add("Anaconda");

		// there is no life of intermediate operator if there is no terminal op
		// terminal op will execute only if intermediate op (filter) returns true
		// We can create stream
		// how to use filter in stream api
		long counts = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(counts);

		// print all names of ArrayList
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
		names.stream().filter(s -> s.length() > 4).filter(s -> s.startsWith("A")).limit(1)
				.forEach(s -> System.out.println(s));

		long d = Stream.of("Abhira", "Jatin", "Palak", "Anshika", "Anaconda").filter(s -> {
			s.startsWith("A"); // evaluates to true or false
			return false; // reject every element in stream, regardless of its value ; stream is empty
							// hence count returned is 0.
		}).count();
		System.out.println(d);

		Stream.of("Abhira", "Jatin", "Palak", "Anny", "Anaconda")
				.filter(s -> s.startsWith("A"))
				.limit(1)
				.forEach(s -> System.out.println("Selected : " + s));
	}

	@Test(enabled=false)
	public void streamMap() {
		//print names that ends with 'a' with upper case
		
		//Manipulate the stream - map
		Stream.of("Abhira", "Jatin", "Palak", "Anny", "Anaconda")
		.filter(s -> s.startsWith("A"))
		.map(s -> s.toUpperCase())
		.forEach(s -> System.out.println("Name in Uppercase : " + s));
		
		//print names which have ends with n , Uppercase and Sorted
		Stream.of("ram","ravan","sita","hanuman","laxman")
		.filter(s->s.endsWith("n"))
		.map(s->s.toUpperCase())
		.sorted()
		.forEach(s->System.out.println(s));
		
		//Merge two lists
		List<String> fruitnames =Arrays.asList("Avocado","Orange","Grapes","Banana","Apple","Tomato");
		
		ArrayList<String> veggienames = new ArrayList<String>();
		veggienames.add("Potato");
		veggienames.add("Onion");
		veggienames.add("Carrot");
		veggienames.add("Tomato");
		
		Stream<String> newstream = Stream.concat(fruitnames.stream(), veggienames.stream());
		//newstream.sorted().forEach(s->System.out.println(s));
		
		boolean isPresent = newstream.anyMatch(s->s.equalsIgnoreCase("grapes7"));
		
		Assert.assertTrue(isPresent);
		
	}
	
	@Test
	public void collectStream() {
		List<String> ls = Stream.of("kiwi","apple","orange","banana")
		.filter(s->s.length()>4)
		.sorted()
		.map(s->s.toUpperCase())
		.collect(Collectors.toList());
		
		System.out.println(ls.get(2));
	}
	
	@Test
	public void streamAssignment() {
		//1. Print unique numbers from array
		//2. sort the array
		
		List<Integer> numbers = Arrays.asList(3,2,2,7,5,1,9,7);
		
		numbers.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		//to get the number at particular index
		List<Integer> result = numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("Element at index 3 is : " + result.get(3));
	}
	
}
