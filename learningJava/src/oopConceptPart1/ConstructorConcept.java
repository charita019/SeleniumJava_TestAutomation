package oopConceptPart1;

public class ConstructorConcept {
	
	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single Param Constructor" + " " + i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("Two Param Constructor" + " " + i + " " + j);
	}
	
	public ConstructorConcept(double a, double b) {
		System.out.println("Different data type");
	}

	public static void main(String[] args) {
		
		ConstructorConcept obj=new ConstructorConcept();
		ConstructorConcept obj1=new ConstructorConcept(10);
		ConstructorConcept obj2=new ConstructorConcept(10,20);
		ConstructorConcept obj3=new ConstructorConcept(10.22,20.54);
	}

}
