//SWAP TWO NUMBERS WITHOUT USING THIRD VARIABLE

package programs;

public class SwapNumber {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;

		swapNumbers(num1, num2);

	}

	public static void swapNumbers(int num1, int num2) {
		// num1= num1+num2 = 5+10 = 15, num2= num1-num2 = 15-10 = 5 , num1 = num1-num2
		// 15-5 = 10

		System.out.println("Numbers before swapping are : " + "num1 = " + num1 + " " +"num2 = " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Numbers after swapping are : " + "num1 = " + num1 + " " +"num2 = " + num2); 
	}

}
