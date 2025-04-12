package programs;

public class HighestNumberInArray {

	public static void main(String[] args) {
		
		int[] array = {83,19,30,47,58,100,3,18};
		
		highestNumberInArray(array);
		

	}
	
	public static void highestNumberInArray(int[] array) {
		int temp = array[0];
		for(int i = 0; i<array.length;i++) {
			if(array[i]>temp) {
				temp=array[i];
			}
		}
		
		System.out.println(temp);
	}

}
