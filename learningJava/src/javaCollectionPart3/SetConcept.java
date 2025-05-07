package javaCollectionPart3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

		Set<String> hset = new HashSet<String>();
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
		
		
		System.out.println("Size of the set is : " + set4.size());
		for(String vegie : set4) {
			System.out.println(vegie);
		}
		
		Set<Integer> set5 = new HashSet<Integer>();
		set5.add(90);
		set5.add(-1);
		set5.add(9);
		set5.add(10);
		System.out.println("Displaying set elements from set 5 :");
		for(int num : set5) {
			System.out.println(num);
		}
		/*
		 * 8. toArray() - returns Array of type Object 
		 */
		Object[] ar = set5.toArray();
		System.out.println("Set to Array : ");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		
		Set<Integer> set6 = new HashSet<Integer>();
		set6.add(1);
		set6.add(3);
		set6.add(2);
		set6.add(4);
		set6.add(8);
		set6.add(9);
		set6.add(0);
		Set<Integer> set7 = new HashSet<Integer>();
		set7.add(1);
		set7.add(3);
		set7.add(7);
		set7.add(5);
		set7.add(4);
		set7.add(0);
		set7.add(8);
		set7.add(9);
		
		//System.out.println("Intersections is : ");
		//boolean intersection = set6.retainAll(set7);
		//System.out.println(intersection);
		//System.out.println(set6);
		
//		System.out.println("Union of Set 6 and Set 7 is : ");
//		set6.addAll(set7);
//		System.out.println(set6);
		
		System.out.println("Difference between Set 6 and Set 7 is : ");
		set6.removeAll(set7);
		System.out.println(set6);
		
		
		Set<String> set8 = new HashSet<String>();
		set8.add("iopy");
		set8.add(" ");
		set8.add("abv");
		set8.add("nkf");
		set8.add(" ");
		set8.add("qwerty");
		set8.add(" ");
		System.out.println("Elements in set 8 are : " + set8);
		
		Set<String> set9 = new LinkedHashSet<String>();
		set9.add("iopy");
		set9.add(" ");
		set9.add("abv");
		set9.add("nkf");
		set9.add(" ");
		set9.add("qwerty");
		set9.add(" ");
		System.out.println("Elements in LinkedHashSet are : " + set9);
		
		Set<String> set10 = new TreeSet<String>();
		set10.add("iopy");
		set10.add(" ");
		set10.add("abv");
		set10.add("nkf");
		set10.add(" ");
		set10.add("qwerty");
		set10.add(" ");
		System.out.println("Elements in TreeSet are : " + set10);
		
	}

}
