package genericprograms;

public class ReverseNumberProgram {

	public static void main(String[] args) {
		
		int number = 1980;
		int rem = 0, rev =0;
		while(number>0){
			rem = number%10;
			rev = rev*10+rem;
			number = number/10;
		}
		
		System.out.println(rev);
	}

}
