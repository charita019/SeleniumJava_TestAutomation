package learningJava;

public class StringLiteralVsObject {
	
	

	@SuppressWarnings("null")
	public static void main(String[] args) {
		/*
		String str1="Testing";
		
		String str2=new String("Testing");
		
		String str3=new String("Testing1");
		
		
		System.out.println(str1==str2); //== check for references
		System.out.println(str1.equals(str2)); //value of string check
		
		System.out.println(str1.equals(str3));
		*/
		
		String s1="Ram";
		String s2="Ram";
		String s5="Shyam";
		
		String s3=new String("Ram");
		String s4=new String("Ram");
		
		String s6=new String("ram");
		
		String nulls1=null;
		String nulls2=null;
		
		System.out.println("Compare string using equals:");
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1.equals(s5)); //false
		System.out.println(s1.equals(s6)); //false
		System.out.println(s1.equalsIgnoreCase(s6)); //true
		//System.out.println(nulls1.equals(nulls2)); //NullPointerException
		
		System.out.println("Compare strings using == operator:");
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
		System.out.println(s3==s4); //false
		System.out.println(nulls1==nulls2); //true
		
		System.out.println("Compare strings using compareTo:");
		System.out.println(s1.compareTo(s3)); //0
		System.out.println(s1.compareTo(s5)); //-1
		System.out.println(s1.compareTo(s6)); //-32
		System.out.println(s1.compareToIgnoreCase(s6)); //0
		
		
	}

}
