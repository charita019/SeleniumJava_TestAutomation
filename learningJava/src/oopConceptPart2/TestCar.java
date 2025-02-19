package oopConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//compile time OR Static Polymorphism
		BMW b=new BMW();
		b.start(); // same method with same arguments in parent and child classes, preference is given to the child class method.
		b.theftSafety();
		b.stop();
		b.refuel();	
		b.engine();
		
		System.out.println("********");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("********");

		//Top Casting 
		//child class object can be referred by parent class reference variable -- dynamic polymorphism or run time polymorphism
		Car c1=new BMW();
		c1.start();
		c1.refuel();
		c1.stop();
		
		//Down Casting -- notallowed
		//BMW b1=new Car(); // not allowed compile time error 
		//BMW b1= (BMW)new Car(); // classcastexception - runtime error
		

	}

}
