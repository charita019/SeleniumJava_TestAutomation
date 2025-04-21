package programs;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] array = { 48, 90, 23, 59, 10, 69, 9 ,1000,3999};
		int res = secondLargest(array);
		System.out.println("Second Largest Number is : " + res);

	}

	public static int secondLargest(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		int largest=Integer.MIN_VALUE , secondlargest = Integer.MIN_VALUE;
		for(int i = 0;i <array.length;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		
		for(int i =0; i<array.length; i++) {
			if(array[i]>secondlargest && array[i]!=largest) {
				secondlargest=array[i];
			}
		}
		return secondlargest;
	}
}
