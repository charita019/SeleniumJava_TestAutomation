package javaCollectionPart3;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add("Tom");
		ar.add(12.33);
		System.out.println(ar.size());
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		ar.add(400);
		ar.add('M');
		ar.add("02/06/2025");
		System.out.println(ar.size());
		
		ar.add(600);
		System.out.println(ar.size());
		ar.remove(8);
		System.out.println(ar.size());
		
		//get value at particular index
		System.out.println(ar.get(5));
		
		//print all values
		for(int i=0;i<ar.size();i++) {
			System.out.println("The values are : " + "Index :" + i + " " + "Value :"+ar.get(i));
		}
		
		//to restrict any Arraylist to accept only one particular data type values
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		//ar1.add("Tom"); //error
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Tom");
		ar2.add("Jerry");
		//ar2.add(100); //error
		

	}

}
