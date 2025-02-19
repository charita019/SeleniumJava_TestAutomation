package oopConceptPart1;

public class ConstructorWithThisKeyword {
	
	//class variables 
	String name;
	int age;
	
	// to initialize the global variables / class variables = use this keyword
	public ConstructorWithThisKeyword(String name, int age) {
		this.name=name;
		this.age=age;
		
		System.out.println(name + " " + age);
		
	}
	
	

	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 32);

	}

}
