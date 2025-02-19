package oopConceptPart1;

public class B extends A {

	public B() {
		super();
		// System.out.println("Child class contructor");
	}

	public B(int i) {
		super(i);
		// System.out.println(i);
	}

	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(10);
	}
}
