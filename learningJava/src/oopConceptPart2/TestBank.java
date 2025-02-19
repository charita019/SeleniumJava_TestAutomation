package oopConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		//USBank u=new USBank(); // cannot create object for an interface
		
		//HSBCBank h1=new USBank(); // cannot create object like this also
		
		//Compile time polymorphism
		HSBCBank h=new HSBCBank();
		h.credit();
		h.debit();
		h.transferMoney();
		h.educationLoan();
		h.carLoan();
		h.mutualfund();
		
		// dynamic polymorphism 
		// child class object can be referred by parent interface reference variable
		// only overridden methods can be called
		// education loan and car loan are methods of hsbc bank
		USBank u1=new HSBCBank();
		u1.credit();
		u1.debit();
		u1.transferMoney();
		
		BrazilBank b=new HSBCBank();
		b.mutualfund();
		
		//System.out.println(min_bal);
		System.out.println(USBank.min_bal);
		
		//USBank.min_bal=200; cannot change the value of the interface variable
		
	}

}
