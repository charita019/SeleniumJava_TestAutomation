package programs;

import java.util.ArrayList;

public class PrintArmstrongNumbers {

	public static void main(String[] args) {
		
		
		int numlimit=-100;
		
		ArrayList<Integer> result = printArmstrongNumbers(numlimit);
		
		if(result.size()>0) {
			System.out.println("Armstrong numbers are :" + result);
		}
		else {
			System.out.println("No armstrong number found!!");
		}

	}
	
	public static ArrayList<Integer> printArmstrongNumbers(int numlimit){
		ArrayList<Integer> al = new ArrayList<Integer>();
		if(numlimit<1) {
			return al;
		}
		
		for(int i = 1;i<=numlimit;i++) {
			
			int rem = 0, sum = 0;
			int j = i;
			
			int len = Integer.toString(i).length();
			while(j>0) {
				rem=j%10;
				j=j/10;
				sum = sum + (int)Math.round(Math.pow(rem, len));
			}
			
			if(sum==i) {
				al.add(i);
			}
		}
		return al;
	}
}
