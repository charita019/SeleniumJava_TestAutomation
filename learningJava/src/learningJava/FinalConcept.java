package learningJava;

public class FinalConcept {
	
	 int number = 30;
	
	public int changeNum() {
		number = 40;
		return number;
	}
	
	public static void main(String[] args) {
		
		FinalConcept fc = new FinalConcept();
		int result = fc.changeNum();
		System.out.println(result);
	
	}

}
