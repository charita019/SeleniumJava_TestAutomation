package abstractionConcept;

public class BMW implements Car {

	@Override
	public void start() {
		System.out.println("BMW Started");

	}

	@Override
	public void stop() {
		System.out.println("BMW Stopped");

	}

	@Override
	public void refuel() {
		System.out.println("BMW Refuelled");

	}
	
	//non - overridden methods
	public void theftsafety() {
		System.out.println("BMW theft safety");
	}

}
