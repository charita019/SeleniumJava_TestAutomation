package section14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class StreamPrograms {

	@Test (priority = 1)
	public void program1() {
		// Print multiples of 5 from the list

		List<Integer> multiples = Arrays.asList(10, 45, 16, 90, 88, 51);
		System.out.println("Printing multiples of 5: ");
		multiples.stream().filter(s -> s % 5 == 0).forEach(System.out::println);
	}

	@Test (priority = 2)
	public void program2() {
		// get only even numbers from the arraylist

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(6);
		al.add(9);
		al.add(4);
		al.add(20);

		System.out.println("Printing the collection : " + al);

		List<Integer> evenNum = al.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		System.out.println("Printing even numbers only : " + evenNum);
	}

	@Test (priority = 3)
	public void stringWithNumber() {
		// Program to find strings which start with numbers

		List<String> ls = Arrays.asList("12Test", "Test27", "89Abc", "That");

		List<String> result = ls.stream()
				.filter(s -> Character.isDigit(s.charAt(0)))
				.collect(Collectors.toList());

		System.out.println("Strings starting with digit are : " + result);
	}

	@Test (priority = 4)
	public void duplicatesFromArray() {
		// find duplicate elements from an array

		List<Integer> nums = Arrays.asList(2, 4, 2, 2, 4, 1, 5, 5, 4, 5, 6);
		

	}

	@Test (priority = 5)
	public void removeDuplicates() {
		//Input -> abbccdaaa Output-> abcd -> remove duplicates from string

		String str = "abbccdaaa";
		
	List<String> ls = new ArrayList<String>(Arrays.asList(str.split("")));
	List<String> result = ls.stream().distinct().collect(Collectors.toList());
	System.out.println(result);
	}
	
	@Test (priority = 6)
	public void countCharactersInString() {
	
		String str = "abbccdaaa";
		List<String> ls = new ArrayList<String>(Arrays.asList(str.split("")));
		
		System.out.println("Printing the list : " + ls);
		
		
		
		
	}
}
