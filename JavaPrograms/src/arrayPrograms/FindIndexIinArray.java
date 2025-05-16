package arrayPrograms;

public class FindIndexIinArray {

	public static void main(String[] args) {
		
		
		int[] arr= {6,8,11,6,7,18};
		int targetsum=17;
		
		//find indices of two array elements whose sum equals target 
		findelementindex(arr,targetsum);

	}
	
	
	public static void findelementindex(int[] arr, int targetsum) {
		
		for(int i = 0; i<arr.length ; i++) {
			for(int j = i+1 ; j<arr.length; j++) {
				if((arr[i]+arr[j])==targetsum) {
					System.out.println("Index Numbers are : " + i + " " + j);
				}
			}
		}
	}
}
