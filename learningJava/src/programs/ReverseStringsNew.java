package programs;

public class ReverseStringsNew {
	
	public void reverseString(String str) {
		System.out.println("Reverse string letter by letter");
		String[] arrstr = str.split("");
		int len = arrstr.length;	
		String revArr = "";
		for(int i = len-1;i>=0;i--) {
			revArr=revArr+arrstr[i];
		}
		System.out.print(revArr);
	}
	
	public void reverseWordString(String str) {
		System.out.println("Reverse string by word");
		String[] arStr = str.split(" ");
		int len = arStr.length;
		String revWAr="";
		for(int i = len-1;i>=0;i--) {
			revWAr+=arStr[i];
		}
		System.out.println(revWAr);
	}
	
	public void reverseStringPreserveSpace(String str) {
		System.out.println("Reverse string by preserving spaces ");
		String[] arStr = str.split("");
		int len = arStr.length;
		
		String[] result = new String[arStr.length];
		
		for(int i = 0;i<len; i++) {
			if(arStr[i]==" ") {
				result[i]=" ";
			}
		}
		
		int j = result.length-1;
		for(int i=0;i<len;i++) {
			
			if(arStr[i]!=" ") {
				if(result[j]==" ") {
					j--;
				}
				result[j]=arStr[i];
				j--;
			}
		}
		System.out.println(String.valueOf(result));
	}

	public static void main(String[] args) {
		String str = "This is a string";
		ReverseStringsNew rev = new ReverseStringsNew();
		rev.reverseString(str);
		System.out.println("\n");
		rev.reverseWordString(str + " ");
		System.out.println("\n");
		rev.reverseStringPreserveSpace(str);
	}
}
