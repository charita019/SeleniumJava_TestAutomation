package programs;

public class ElementSumStringArray {

	public static void main(String[] args) {
		
		
		String[] arr = {"1","2","3"};
		int sum = 0;
		for(int i = 0; i<arr.length;i++) {
			sum=sum+Integer.parseInt(arr[i]);
		}
		System.out.println(sum);

	}

}
