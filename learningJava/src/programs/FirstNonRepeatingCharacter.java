package programs;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ggrrrreeeeekkkkkkks";
		char result = firstNonRepeat(str);
		System.out.println(result);
	}
	
	public static char firstNonRepeat(String str) {
		char[] arr = str.toCharArray();
		
		for(int i = 0; i<arr.length;i++) {	
			int flag  = 0;
			for(int j = 0 ; j<arr.length; j++) {
				if(arr[i]==arr[j] && i!=j) {
					flag = 1;
					break;
				}
			}
			
			if(flag==0) {
				return arr[i];
			}
		}
		return 'c';
	}

}
