package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "My name is Mojo Jojo";
		//output = Jojo Mojo is name My
		
		reverseString(input);

	}
	
	public static void reverseString(String input) {
		String[] charArray = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = charArray.length-1 ; i>=0; i--) {
			sb.append(charArray[i]+ " ");
		}
		
		System.out.println(sb);
	}

}
