package section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListJava {

	public static void main(String[] args) {
		//Normal
		ArrayList arr = new ArrayList();
		arr.add("String");
		arr.add(12);
		arr.add(43.4);
		arr.add(true);
		
		//Restrict 
		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add("JS");
		stringArrayList.add("CS");
		stringArrayList.add("Dev");
		stringArrayList.add("QA");
		
		for(String val : stringArrayList) {
			System.out.println(val);
		}
		System.out.println(stringArrayList.get(3));
		
		stringArrayList.remove(3);
		//System.out.println(stringArrayList.get(3)); //index out of bound error
		System.out.println(stringArrayList.get(2));
		System.out.println("*********");
		//item present in arraylist or not
		System.out.println(stringArrayList.contains("QA"));
		
		
		System.out.println("************************");
		//Normal Array
		String[] names = {"JS","CS","PG"};
		//convert Array into ArrayList
		List<String> nameArrayList = Arrays.asList(names);
		

	}

}
