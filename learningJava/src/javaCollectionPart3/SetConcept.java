package javaCollectionPart3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {

		// Set set = new Set(); Set is an interface. cannot instantiate an interface

		// Raw type - can store any type of object
		Set set = new HashSet();
		set.add("abc");
		set.add(123);
		set.add('c');

		System.out.println("Displaying objects in set : " + set);

		// Generic
		Set<String> sset = new HashSet<String>();
		sset.add("tom");
		// sset.add(123);
		// sset.add('e'); Incompatible

		Set<Integer> iset = new HashSet<Integer>();
		iset.add(230);
		iset.add(4);
		iset.add(900);
		System.out.println("Displaying an Integer Set :" + iset);

		Set<String> hset = new HashSet();
		hset.add("594");
		hset.add("d");
		System.out.println("Displaying contents of Set : " + hset);

		Set<String> ehset = new HashSet<String>();
		System.out.println("Empty HashSet : " + ehset);

		// Set Methods
		// 1. add(element) -
		/*
		 * returns true - if element is not present and would be added returns false -
		 * if element is already present and will not be added
		 */

		Set<String> hashset = new HashSet<String>();
		System.out.println(hashset.add("tom"));
		System.out.println(hashset.add("jerry"));
		System.out.println(hashset.add("jerry"));

		System.out.println("Add Method of Set :" + hashset);

		// 2. clear()
		/*
		 * Clear out the set but set will exists i.e. reference to set still exists
		 */
		hashset.clear();
		System.out.println("HashSet after clear is : " + hashset);

		// 3. contains(element)
		/*
		 * Check whether element exists in set or not. Returns true - element exists
		 * Returns false - element does not exists.
		 */

		Set<String> set1 = new HashSet<String>();
		set1.add("tom");
		set1.add("jerry");
		set1.add("spike");
		set1.add("donald");
		set1.add("goofy");

		System.out.println("Contents of Set1 are : " + set1);

		System.out.println("Check contains method for Scooby : " + set1.contains("scooby"));
		System.out.println("Check contains method for goofy : " + set1.contains("goofy"));

		//4. hashCode()
		/*
		 * gets the hashcode value for the instance of the set.
		 * Returns integer value which is the hashcode
		 */
		System.out.println("Hashcode for set1 is : " + set1.hashCode());
		
		//5. isEmpty()
		/*
		 * Checks whether the set is empty or not
		 * Returns true - if set is empty
		 * Returns false - if set is not empty
		 */
		
		Set<Double> set2 = new HashSet<Double>();
		System.out.println("Status of set : IS Empty ? : " + set2.isEmpty());
		set2.add(390.34);
		set2.add(4305.23);
		set2.add(1.0);
		set2.add(4449.4);
		System.out.println("Status of set : IS Empty ? : " + set2.isEmpty());
		
		//6. iterator()
		/*
		 * Return the iterator of the set.
		 * Elements of set are returned in random order
		 */
		Set<String> set3 = new HashSet<String>();
		set3.add("Apple");
		set3.add("mango");
		set3.add("grapes");
		set3.add("orange");
		
		Iterator<String> it = set3.iterator();
		System.out.println("Element from set returned :" + it.next());
		
		//hasNext() - returns true if iterator has more elements
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//7. remove(element)
		/*
		 * Remove all elements from collection which are present in set.
		 * Returns true - if set changed as a result of the call
		 */
		
		Set<String> set4 = new HashSet<String>();
		set4.add("Potato");
		set4.add("Tomato");
		set4.add("onion");
		set4.add("Ladyfinger");
		System.out.println("Displaying elements of set : " + set4);
		System.out.println("Status of Set : " + set4.remove("Potato"));
		System.out.println("Status of Set : " + set4.remove("Potato"));
		
	}

}
