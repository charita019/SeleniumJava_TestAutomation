package section3;

public class JavaCodeExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = {12.34,438,829.1,89.999,1};
		
		//Access and Print
		System.out.println("First Number is : " + numbers[0]+ " " +"Last Number is : " + numbers[numbers.length-1]);
		
		//Reverse Order
		System.out.println("------Numbers in Reverse Order------");
		for(int i = numbers.length-1;i>=0;i--) {
			System.out.print(numbers[i]+ " ");
		}
		System.out.println("\n");
		
		//Element Count	
		System.out.println("Total Number of elements is : " + numbers.length);
		
	}

}
