package programs;

public class ReverseStringByLetter {

	public static void main(String[] args) {
		
		//String input = "My name is Mojo Jojo";
		String input = "Java is good programming language";
		reverseStringByLetter(input);

	}
	
	public static void reverseStringByLetter(String input) {
		String[] charArray = input.split("");
		String rev = "";
		for(int i = charArray.length-1; i>=0; i--) {
			rev=rev+charArray[i];
		}
		System.out.println(rev);
	}

}
