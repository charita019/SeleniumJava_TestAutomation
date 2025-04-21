package programs;

public class SecondSmallestInArray {

	public static void main(String[] args) {

		int[] arr = { 48, 90, 23, 59, 10, 69, 9 ,2,-1,-5};

		int result = secondSmallestLargest(arr);
		
		System.out.println("Second Smallest Number is : " + result);
	}

	public static int secondSmallestLargest(int[] arr) {
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int smallest = Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<secondsmallest && arr[i]!=smallest) {
				secondsmallest = arr[i];
			}
		}
		
		return secondsmallest;
		
	}

}