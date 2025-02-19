package javaCollectionPart3;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		//dynamic hashtable
		
		Hashtable h=new Hashtable();
		h.put("A","Test");
		h.put("B","Hello");
		h.put("C", "World");
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		System.out.println(h.get(2)); //index 5 not exist - No error generated and result returned null
		
		System.out.println(h.get("C"));
		
		h.put(3, "Tom");
		
		//Restrict data type in a hashtable
		Hashtable<Integer,Integer> h2=new Hashtable<Integer,Integer>();
		h2.put(1, 200);
		h2.put(2, 400);
		//h2.put(3, "Tom"); //error
		
		Hashtable<Character,String> h3=new Hashtable<Character,String>();
		h3.put('A',"Tom");
		h3.put('B', "Jerry");
		//h3.put("Test", 'M'); //error
		
		
		
		

	}

}
