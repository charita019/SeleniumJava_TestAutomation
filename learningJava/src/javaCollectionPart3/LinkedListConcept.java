package javaCollectionPart3;

import java.util.LinkedList;
import java.util.List;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		int n =5;
		List<Integer> llist = new LinkedList<Integer>();
		
		for(int i = 1; i<=n;i++) {
			llist.add(i);
		}
		
		System.out.println("LinkedList is : " + llist);
		
		//remove an element
		llist.remove(2);
		System.out.println("LinkedList after removing element from index 2 is : " + llist);
		
		//prinitng elements 
		System.out.println("Printing linked list elements : ");
		for(int num : llist ) {
			System.out.println(num);
		}

	}

}
