package programs;


public class ReverseWordInStringProgram {

	public static void main(String[] args) {

		String s = "test12pop90java989pyt";
		// output : tset12pop90avaj989typ

		reversewordinstring(s);
		

	}
	
	
	public static void reversewordinstring(String s) {
		
		  StringBuilder result = new StringBuilder();
	      StringBuilder temp = new StringBuilder();

	        for (char ch : s.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                result.append(temp.reverse()); // reverse collected characters
	                temp.setLength(0); // clear temp
	                result.append(ch); // add the digit as is
	            } else {
	                temp.append(ch); // collect character
	            }
	        }

	        // Append any remaining reversed characters
	        result.append(temp.reverse());

	        System.out.println(result.toString());
	}
}
