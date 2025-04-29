package learningJava;

public class FunctionalInterfaceMain implements functionalInterfaceExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	@Override
	public int calc(int a, int b) {
		// TODO Auto-generated method stub
		
		functionalInterfaceExample add = (int x , int y)->x+y;
		int result = add.calc(a, b);
		
		return result;
		
	}

}
