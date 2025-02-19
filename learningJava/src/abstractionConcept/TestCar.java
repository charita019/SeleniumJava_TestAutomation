package abstractionConcept;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();

		Car c = new BMW(); // dynamic polymorphism
		c.start();
		c.stop();
		c.refuel();
		// c.theftsafety(); // not accessible - only in BMW Class
	}

}
