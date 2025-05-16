package polymorphismConcept;

public class BMW extends Car {

//	public void display() {
//		System.out.println("BMW Display Method");
//	}
	public void autoparking() {
		System.out.println("I am BMW's feature of Auto-Parking");
	}
	
	public static void main(String[] args) {
		
		
		BMW bmw = new BMW();
		bmw.autoparking();
		
		Car c = new Car();
		c.display();

		Car car = new BMW(); //top casting
		car.display();
		
		/*
		 * not allowed as autoparking is a method of child class and 
		 * super class cannot call sub class methods
		 */
		// car.autoparking(); 
		
		//BMW b = new Car(); Not allowed - Downcasting cannot be done 
		
		
		BMW b1 =(BMW) new Car();
		b1.autoparking();
		
	}

}
