package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {

	public static void main(String[] args) {
		
		int[] arr = {10,35,2,54,765,90,55,101,-5};
		
		printEvenOdd(arr);
		printEvenOddUsingStreams(arr);

	}
	
	public static void printEvenOdd(int[] arr) {
		
		System.out.println("Even Numbers are :");
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Odd Numbers are :");
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void printEvenOddUsingStreams(int arr[]) {
		List<Integer> evenlist = Arrays.stream(arr)
				.filter(n->n%2==0)
				.boxed()
				.collect(Collectors.toList());
		
		List<Integer> oddlist = Arrays.stream(arr)
				.filter(n->n%2!=0)
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println("Even List is : " + evenlist);
		System.out.println("Odd List is : " + oddlist);
	}

}
