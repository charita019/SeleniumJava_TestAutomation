package oopConceptPart1;

public class StaticAndNonStaticConcept {
	
	String name="Tom";  // non-static global variable
	static int age=25;  // static global variable

	public static void main(String[] args) {
		//how to call static methods and variables - 2 ways
		// call static methods
		//1. direct calling
		sum();
		//2. call by classname
		StaticAndNonStaticConcept.sum();
		
		//call static variables
		//1. direct call
		System.out.println(age);
		
		//2. call by classname
		System.out.println(StaticAndNonStaticConcept.age);
		
		//To call non static methods and variables
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//if we call static method using object reference
		obj.sum(); //warning
		

	}
	
	//non static method
	public void sendMail() {
		System.out.println("Send Mail Method");
	}
	
	//static method
	public static void sum() { 
		System.out.println("Sum Method");
	}

}
