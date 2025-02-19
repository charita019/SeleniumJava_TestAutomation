package learningJava;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		
		int i=1;
		int j=i++; //post increment
		
		System.out.println(i);
		System.out.println(j);
		
		int a=1;
		int b=++a; //pre increment = increase value of a by 1 and then give it to b
		
		System.out.println(a);
		System.out.println(b);

	}

}
