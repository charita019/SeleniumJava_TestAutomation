package programs;

public class PrintIndex {

	public static void main(String[] args) {
		
		int[] array = {8,10,1,19,50,89,19,15,13,20};
		
		PrintIndex pi = new PrintIndex();
		pi.printElementIndex(array,1,19);

	}
	
	public void printElementIndex(int[] array, int num1, int num2) {
		for(int i = 0;i<array.length;i++) {
			if(array[i]==num1 || array[i]==num2) {
				System.out.println("Element found as index : " + i);
			}
		}
	}

}
