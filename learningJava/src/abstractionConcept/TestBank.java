package abstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		HDFCBank hd=new HDFCBank();
		
		hd.credit();
		hd.debit();
		hd.loan(); //overriden method
		hd.fundsmethod();
		
		Bank b=new HDFCBank(); // dynamic polymorphism
		b.loan(); 
		b.credit();
		b.debit();
		//b.fundsmethod() cannot be accessed
		
		

	}

}
