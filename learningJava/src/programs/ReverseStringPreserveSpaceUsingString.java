package programs;

public class ReverseStringPreserveSpaceUsingString {

	public static void main(String[] args) {
		
		String str = "This is a java code";
		
		reversestring(str);

	}
	
	public static void reversestring(String str) {
		String[] strarr = str.split("");
		String[] result = new String[strarr.length];
		
		for(int i =0;i<strarr.length; i++) {
			if(strarr[i].equals(" ")) {
				result[i]=" ";
			}
		}
		
		int j = result.length-1;
		
		for(int i = 0; i < strarr.length; i++) {
			if(!strarr[i].equals(" ")) {
				if(result[j]== " ") {
					j--;
				}
				result[j]=strarr[i];
				j--;
			}
		}
		
		System.out.println(String.join("",result));
		
	}

}
