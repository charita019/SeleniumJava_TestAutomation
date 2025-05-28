package arrayPrograms;

public class secondHighest {

	public static void main(String[] args) {

		int[] arr = { 13, -11, 32, 10, 3, 9, -13 };

		printsecondHighest(arr);

	}

	public static void printsecondHighest(int[] arr) {

		int secondHighest = Integer.MIN_VALUE;
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				largest = arr[i];
			}

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondHighest && arr[i] != largest) {
				secondHighest = arr[i];
			}

		}
		System.out.println(secondHighest);

	}

}
