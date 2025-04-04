//Program to print duplicates and their count

package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounts {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input : ");
		String input = scanner.nextLine();
		scanner.close();
		
		findDuplicateAndCount(input);

	}
	
	public static void findDuplicateAndCount(String input) {
		String[] charArr = input.split("");
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		for(int i = 0; i < charArr.length; i++) {
			String key = charArr[i].toLowerCase();
			
			if(!key.equals(" ")) {
				if(hmap.containsKey(key)) {
					int count = hmap.get(key);
					hmap.put(key, count+1);
				}
				else {
					hmap.put(key, 1);
				}
			}
		}
		
		System.out.println("Duplicate characters and their counts is : ");
		for(Map.Entry<String,Integer> duplicateCounts : hmap.entrySet()) {
			if(duplicateCounts.getValue()>1) {
				System.out.println(duplicateCounts.getKey() + " = " + duplicateCounts.getValue());
			}
		}
	}
}

