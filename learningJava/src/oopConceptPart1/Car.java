package oopConceptPart1;

public class Car {
	
	//Global OR Class Variables
	int modelno;
	int wheel;
	
	

	public static void main(String[] args) {
		//new Car() => object of car class
		//a,b,c => object reference variables
		//new keyword used to create the object
		
		Car a=new Car();
		Car b=new Car();
		Car c= new Car();
		
		a.modelno=2015;
		a.wheel=4;	
		
		b.modelno=2016;
		b.wheel=4;
		
		c.modelno=2014;
		c.wheel=4;
		
		//Print
		System.out.println("Before Assigning References :");
		System.out.println(a.modelno);
		System.out.println(a.wheel);
		
		System.out.println(b.modelno);
		System.out.println(b.wheel);
		
		System.out.println(c.modelno);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the references");
		a=b;
		b=c;
		c=a;
		
		a.modelno=10;
		System.out.println(a.modelno); //10
		c.modelno=20;
		System.out.println(a.modelno); //20
		System.out.println(c.modelno); //20
		
		

	}

}
