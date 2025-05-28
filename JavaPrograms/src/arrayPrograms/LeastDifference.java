package arrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeastDifference {

	public static void main(String[] args) {

		int[] arr = { 3, 9, 50, 15, 99, 7, 98, 65 };

		leastDiff(arr);

	}

	public static void leastDiff(int[] arr) {

		Arrays.sort(arr);
		// 3,7,9,15,50,65,98,99
		
		int minDiff = Integer.MAX_VALUE;
		List<int []> resultpair = new ArrayList<>();
		for (int i = 0; i < arr.length-1; i++) {
			
			int diff = arr[i+1]-arr[i];
			
			if(diff<minDiff) {
				minDiff = diff;
				resultpair.clear();
				resultpair.add(new int[] {arr[i],arr[i+1]});
			}
			else if(diff==minDiff) {
				resultpair.add(new int[] {arr[i],arr[i+1]});	
			}
		}
		
		System.out.println("Minimum Difference is :");
		for(int[] pair : resultpair) {
			System.out.println(pair[0] + " , " + pair[1]);
		}
		
	}
}
