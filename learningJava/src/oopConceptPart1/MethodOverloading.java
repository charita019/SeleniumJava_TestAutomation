package oopConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
		
	}
	
	//Sum is an overloaded method
	public void sum() {
		System.out.println("Sum Method with zero arguments");
	}
	
	public void sum(int i) { //1 input parameter
		System.out.println("Sum Method with 1 input param : " + i);
	}
	
	public void sum(int i, int j) { //2 input parameter
		System.out.println("Sum Method with 2 input params : " + (i+j));
	}
	
	public float sum (float i) {
		
		return i;
	}
	
	public static void main(int p) {
		
	}

}
