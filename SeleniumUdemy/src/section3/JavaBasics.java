package section3;

public class JavaBasics {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=4;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2 = {1,2,3,4,5,4,5,6,7,8,10};
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		String[] arr3 = {"JS", "CS" , "DEV", "QA"};
		for(int i = 0 ; i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		
		//enhanced for loop
		for(String val : arr3) {
			System.out.println(val);
		}

	}

}
