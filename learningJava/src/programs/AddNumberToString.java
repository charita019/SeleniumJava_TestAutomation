package programs;

public class AddNumberToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "18404";
		
		addNumber(str);

	}
	
	public static void addNumber(String str) {
		int num = Integer.parseInt(str);
		num = num + 1;
		//System.out.println(num);
		
		String result = Integer.toString(num);
		System.out.println(result);
	}

}
