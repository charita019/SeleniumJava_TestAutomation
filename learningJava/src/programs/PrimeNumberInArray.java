//Prime Number in Array

package programs;

import java.util.ArrayList;

public class PrimeNumberInArray {

	public static void main(String[] args) {

		int[] array = { 90, 91, 97, 48, 16, 5, 19, 67, 36, 37, 1 };

		ArrayList<Integer> result = primeNumber(array);
		System.out.println(result);

	}

	public static ArrayList<Integer> primeNumber(int[] array) {
		boolean isPrime = true;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= 1) {
				continue;
			}

			for (int j = 2; j < array[i]; j++) {
				if ((array[i] % j == 0)) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
			if (isPrime) {
				primes.add(array[i]);

			}
		}

		return primes;
	}

}
