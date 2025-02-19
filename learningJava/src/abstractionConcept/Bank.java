package abstractionConcept;

public abstract class Bank {
	
	int amt=100;
	final int rate=10;
	static int loanRate=5;
	
	//one method should be there which is abstract in nature
	//only method signature/prototype and no body	
	//abstraction - hiding implementation logic
	//abstract class can have abstract and non abstract methods
	
	//partial abstraction
	public abstract void loan();
	
	//non abstract methods
	public void credit() {
		System.out.println("Bank Credit");
	}
	
	public void debit() {
		System.out.println("Bank Debit");
	}

}
