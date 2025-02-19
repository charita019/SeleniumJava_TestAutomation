package oopConceptPart1;

public class LocalvsGlobalVariables {
	
	//Global variables OR Class variables
	String name="Tom";
	int age=25;
	
	//access global variables , create object of the class
	

	public static void main(String[] args) {
		int i=10; //local variable
		System.out.println(i);
		
		LocalvsGlobalVariables obj=new LocalvsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}
	
	public void sum() {
		//local variables
		int i=15;
		int j=20;
		int age=25;
		
	}

}
