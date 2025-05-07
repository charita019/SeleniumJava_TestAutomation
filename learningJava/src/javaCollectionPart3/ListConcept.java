package javaCollectionPart3;

import java.util.ArrayList;
import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("C#");
		list.add("JavaScript");
		
		System.out.println("Arraylist is : " + list);
		
		System.out.println("Elements in arraylist are : ");
		for(String ls : list) {
			System.out.println(ls);
		}
		
		System.out.println("Element at index 3 is : " + list.get(3));
		
		//Update an element
		list.set(2, "Selenium");
		System.out.println("ArrayList after Update is : " + list);
		
		//Remove an element 
		list.remove(2);
		System.out.println("ArrayList after removing element is : " + list);

	}

}
