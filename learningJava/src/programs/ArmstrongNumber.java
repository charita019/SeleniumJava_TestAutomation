package programs;

import static java.lang.Math.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 2;
		 
		boolean result = armstrongNumber(number);
		if(result == true) {
			System.out.println(number + " is an Armstrong Number");
		}
		else {
			System.out.println(number + " is not an Armstrong Number");
		}
	}
	
	public static boolean armstrongNumber(int number) {
		boolean isArmstrongNumber = false;
		
		if(number<1) {
			return isArmstrongNumber;
		}
		
		int numberlength = Integer.toString(number).length();
		int temp = number;
		int rem=0, sum=0;
		while(temp>0) {
			rem = temp % 10 ;
			temp = temp / 10;
			sum = sum + (int)round(pow(rem, numberlength));
		}
		
		if(sum==number) {
			isArmstrongNumber = true;
		}
		
		return isArmstrongNumber;
	}
}
