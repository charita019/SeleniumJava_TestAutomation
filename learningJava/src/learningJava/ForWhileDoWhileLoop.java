package learningJava;

public class ForWhileDoWhileLoop {

	public static void main(String[] args) {
		
		int num=1;
		
		//while loop
		System.out.println("While Loop");
		while(num<=10) {
			System.out.println(num);
			num++;
		}
		System.out.println("While Loop Finished");
		
		System.out.println("Do While Loop");
		num=1;
		do {
			System.out.println(num);
			num++;
		}while(num>10);
		
		System.out.println("Outside do while loop");
		
		for(num=1;num<=10;num++) {
			System.out.println(num);
		}
		System.out.println("Outside for loop");
	}

}
