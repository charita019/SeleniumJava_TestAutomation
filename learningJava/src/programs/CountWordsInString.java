package programs;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " Welcome to Java programming world ";
		
		int count = countWords(str);
		if(count==0) {
			System.out.println(str + " String is blank");
		}
		else {
		System.out.println("Count of words in " + str + " is : " + count);
		}
	}
	
	public static int countWords(String str) {
		
		String[] strarr = str.trim().split(" ");
		
		
		if(strarr.length==0) {
			return strarr.length;
		}
		
			
		return strarr.length;
	}

}
