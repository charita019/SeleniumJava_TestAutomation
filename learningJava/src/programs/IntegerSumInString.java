package programs;

public class IntegerSumInString {

	public static void main(String[] args) {
		
		
		String str = "Automation1234testing";
		
		IntegerSumInString is = new IntegerSumInString();
		String output = is.integerSum(str);
		System.out.println(output);

	}

	public String integerSum(String str) {
		
		char[] arr = str.toCharArray();
		int sum =0;
		String nums = "";
		for(int i =0;i<arr.length;i++) {
			if(Character.isDigit(arr[i])) {
				sum = sum + Character.getNumericValue(arr[i]);
				
				nums+=String.valueOf(arr[i]);
			}
		}
		
		String output = str.replace(nums, Integer.toString(sum));
		
		return output;
	}
}
