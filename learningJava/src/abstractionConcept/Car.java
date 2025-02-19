package abstractionConcept;

public interface Car {
	//only final and static variables
	int wheels=4;

	// full abstraction - 100% abstraction
	// can have only abstract methods - i.e. no method body. Only method declaration
	// no need to write abstract keyword

	public void start();

	public void stop();

	public void refuel();

}
