//Prime Number in Array and their index position

package programs;

import java.util.HashMap;
import java.util.Map;

public class PrimeNumberAndIndexInArray {

	public static void main(String[] args) {
		
		int[] array = { 90, 91, 97, 48, 16, 5, 19, 67, 36, 37, 1 };
		
		primeNumberAndIndex(array);

	}
	
	public static void primeNumberAndIndex(int[] array) {
		boolean isPrime = true;
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		for(int i = 0 ;i<array.length ; i++) {
			if(array[i]<=1) {
				continue;
			}
			
			for(int j = 2 ; j < array[i];j++) {
				if(array[i]%j==0) {
					isPrime=false;
					break;
				}
				else {
					isPrime =  true;
				}
			}
			
			if(isPrime) {
				hmap.put(array[i], i);
			}
		}
		
		for(Map.Entry<Integer, Integer> primesIndex : hmap.entrySet()) {
			System.out.println(primesIndex.getKey() + " " + primesIndex.getValue());
		}
	}

}
