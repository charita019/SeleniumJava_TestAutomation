package programs;

public class ThirdLargestElement {

	public static void main(String[] args) {

		int[] arr = { 93, 53, 10, 547, 390, 19 };

		int thirdlargestres = findthirdlargest(arr);
		System.out.println("Using 3 for loop - 3 rd largest is : " + thirdlargestres);

		int thirdlargest = findthirdlargestElement(arr);
		System.out.println("Using 3 variables - 3rd largest is : " + thirdlargest);
	}

	public static int findthirdlargest(int[] arr) {

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		int largest = Integer.MIN_VALUE, SecondLargest = Integer.MIN_VALUE, ThirdLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > SecondLargest && arr[i] < largest) {
				SecondLargest = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > ThirdLargest && arr[i] < SecondLargest && arr[i] < largest) {
				ThirdLargest = arr[i];
			}
		}

		return ThirdLargest;
	}

	public static int findthirdlargestElement(int[] arr) {
		if (arr.length < 3) {
			System.out.println("Array should have atleast 3 elements ");
		}

		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}

			else if (arr[i] > second && arr[i] != first) {
				third = second;
				second = arr[i];
			}

			else if (arr[i] > third && arr[i] != first && arr[i] != second) {
				third = arr[i];
			}
		}
		
		if(third==Integer.MIN_VALUE) {
			System.out.println("Third largest element is not found");
		}
		
		return third;
	}

}
