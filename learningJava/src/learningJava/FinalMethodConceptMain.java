package learningJava;

public class FinalMethodConceptMain extends FinalMethodConcept {
	
	public int cal() {
		return number+number;
	}

	public static void main(String[] args) {
		
		
		FinalMethodConcept fmc = new FinalMethodConceptMain();
		int res = fmc.cal();
		System.out.println(res);

		FinalMethodConcept fmc1 = new FinalMethodConcept();
		int res2 = fmc1.cal();
		System.out.println(res2);
	}

}
