package oopConceptPart1;

public class ChildClass extends ParentClass{
	
//	public void display() {
//		System.out.println("I am child class display method");
//	}
	
	public void display(String name) {
		System.out.println("Child class Display method with name parameter");
		
	}

	public static void main(String[] args) {
		
		
		ChildClass c = new ChildClass();
		c.display();
		
		ParentClass p = new ParentClass();
		p.display();
		
		ParentClass p1 = new ChildClass();
		p1.display();

	}

}
