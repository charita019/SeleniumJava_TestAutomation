package programs;

public class ReverseStringAndPreserveSpace {

	public static void main(String[] args) {
				
		String str = "This is a java code";
		reversestring(str);
	}
	
	public static void reversestring(String str){
	    
	    char[] ar = str.toCharArray();
	    char[] result =new char[ar.length];
	    
	    for(int i =0 ;i<ar.length;i++){
	        if(ar[i]==' '){
	            result[i]=' ';
	        }
	    }
	    
	    int j = result.length-1;
	   
	    for(int i = 0 ; i <ar.length ; i++){
	        if(ar[i]!=' '){
	            if(result[j]==' '){
	                j--;
	            }
	            result[j]=ar[i];
	            j--;
	        }
	    }
	    
	    System.out.println(new String(result));
	}
}
