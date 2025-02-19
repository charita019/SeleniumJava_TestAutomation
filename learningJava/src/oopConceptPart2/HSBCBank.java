package oopConceptPart2;

//IS-A relationship
public class HSBCBank implements USBank, BrazilBank { //achieving multiple inheritance
	public void credit() {
		System.out.println("HSBC Credit");
	}
	
	public void debit() {
		System.out.println("HSBC Debit");
	}
	
	public void transferMoney() {
		System.out.println("HSBC Transfer Money");
	}
	
	public void educationLoan() {
		System.out.println("HSBC Education Loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC Car Loan");
	}
	
	public void mutualfund() {
		System.out.println("HSBC Mutual Fund");
	}
}
