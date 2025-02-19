package oopConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		FunctionsInJava f=new FunctionsInJava();
		//object 0 FunctionsInJava will be created in Java's memory ; f is the reference to this object
		//after object is created, a copy of all non static methods will be given to this object
		
		f.test();
		int result=f.test2();
		System.out.println(result);
		
		String sresult=f.qa();
		System.out.println(sresult);
		
		int dres=f.division(30, 10);
		System.out.println(dres);
		
		
	
	}
	//non static methods
	
	//void -- does not return any value
	//return type of test() method is void
	public void test() { // no input and no output
		System.out.println("test Method");
	}
	
	//return type of this method is int
	public int test2() { //no input, some output
		System.out.println("test2 method");
		int a=10;
		int b=20;
		int c=a+b;
		
		//return from method
		return c;
	}
	
	public String qa() { //no input, some output
		System.out.println("qa method");
		String s="Selenium";
		return s;
	}
	
	public int division(int x, int y) { //some input, some output
		System.out.println("division method");
		int d=x/y;
		return d;
	}
	
}
