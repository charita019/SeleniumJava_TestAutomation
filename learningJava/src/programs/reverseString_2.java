package programs;

public class reverseString_2 {

	public static void main(String[] args) {
				String input = "My Name is Charita";
				String[] res = input.split(" ");
				int len = res.length;
				String temp = "";
				
				for(int i=len-1; i>=0; i--){
				    temp = temp+res[i];
				}
			}
		}
