package javaCollectionPart3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static <E> void main(String[] args) {
		
		ArrayList ar=new ArrayList(); // non generic
		ar.add("Tom");
		ar.add(100);
		ar.add(12.33);
		ar.add(true);
		ar.add('a');
		
		//Generic
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		//ar.add("Tom"); //error
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Jerry");
		// ar2.add(100); //error
		
		ArrayList<Boolean> ar3= new ArrayList<Boolean>();
		ar3.add(true);
		ar3.add(false);
		//ar3.add('c'); //error
		
		//data type is not decided
		ArrayList<E> ar4=new ArrayList<E>();
		
		Employee e1=new Employee("CS", 30, "QA");
		Employee e2=new Employee("Jatin",32,"DEV");
		Employee e3=new Employee("Jerry",10,"Admin");
		
		//create arraylist
		ArrayList<Employee> ar5=new ArrayList<Employee>();
		ar5.add(e1);
		ar5.add(e2);
		ar5.add(e3);
		
		//Iterator to iterate/traverse the values
		Iterator<Employee> it=ar5.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("**********Add All**************");
		//addAll - to merge two arraylist
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("Jerry");
		ar6.add("Tom");
		
		ArrayList<String> ar7=new ArrayList<String>();
		ar7.add("Cartoon");
		ar7.add("Anime");
		
		ar6.addAll(ar7);
		
		for(int i=0;i<ar6.size();i++) {
			System.out.println(ar6.get(i));
		}
		
		System.out.println("***********Remove All******");
		ar6.removeAll(ar7);
		for(int i=0;i<ar6.size();i++) {
			System.out.println(ar6.get(i));
		}
		
		System.out.println("*************Retain All***************");
		//only common value
		ArrayList<String> ar8=new ArrayList<String>();
		ar8.add("Jerry");
		ar8.add("Tom");
		
		ArrayList<String> ar9=new ArrayList<String>();
		ar9.add("Cartoon");
		ar9.add("Anime");
		ar9.add("Jerry");
		
		ar8.retainAll(ar9);
		for(int i=0;i<ar8.size();i++) {
			System.out.println(ar8.get(i));
		}
		

	}

}
