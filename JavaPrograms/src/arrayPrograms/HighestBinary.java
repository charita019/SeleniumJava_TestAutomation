package arrayPrograms;

public class HighestBinary {

	public static void main(String[] args) {
		int[] arr = {1,0,0,1,0,0,0,1};
		
		int result = highestBinary(arr);
		System.out.println(result);
	}
	
	public static int highestBinary(int[] arr) {
		
		
		if(arr.length == 0) {
			return 0;
		}
		
		int maxcount = 0, count=1; 
		for(int i = 1 ; i<arr.length; i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}
			else {
				maxcount = Math.max(maxcount, count);
				count=1;
			}
		}
		
		return Math.max(maxcount, count);
	}
	
	

}
