package programs;

import java.util.Arrays;
import java.util.HashSet;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 2, 6, 4, 7 ,9,12};

		findmissingnumber(arr);

	}
	
	

	public static void findmissingnumber(int[] arr) {
		//Sort the array in ascending order
		Arrays.sort(arr);	
	
		
		HashSet<Integer> hset = new HashSet<Integer>();
		
		//Add all numbers between  minvalue in array and max value in array into Set 
		for(int i = arr[0]; i<=arr[arr.length-1];i++) {
			hset.add(i);
		}
		
		//Loop - on arraylength and remove elements that are present in array from the hashset
		for(int i =0;i<arr.length;i++) {
			hset.remove(arr[i]);
		}
		
		//print the set elements
		for(int x : hset) {
			System.out.println(x);
		}
	}

}
