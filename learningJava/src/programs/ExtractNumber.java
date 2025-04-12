//Program to extract number from the string
package programs;

public class ExtractNumber {

	public static void main(String[] args) {
		
		String str = "pran123test";
		extractnumber(str);
	}
	
	public static void extractnumber(String str) {
		char[] arr = str.toCharArray();
		String nums="";
		int sum=0;
		for(int i =0; i<arr.length;i++) {
			if(Character.isDigit(arr[i])) {
				
				sum = sum + Character.getNumericValue(arr[i]);
				
				nums=nums+arr[i];
			}
		}
		
		System.out.println(str.replace(nums, Integer.toString(sum)));
	}

}
