package learningJava;

public class IfElseProgram {

	public static void main(String[] args) {
		 int num1=1;
		 int num2=20;
		 int num3=30;
		 
		 if(num1>=num2) {
			 System.out.println(num1 + " is greater than or equal to "+ num2);
		 }
		 else
			 System.out.println(num1 + " is not greater than " + num2);
		 
		 if(num1>num2) {
			 System.out.println(num1 + " is greater than "+ num2);
			 if(num2<num3) {
				 System.out.println("Inside nested if." + num2 + " is less than " + num3);
			 }
			 else
				 System.out.println("Inside nested else. " + num2 + " is greater than "+ num3);
		 }
		 else if(num1==num2)
		 {
			 System.out.println("Inside the second if condition. " + num1 + " is equal to " + num2);
		 }
		 else if(num1 < num2) {
			 System.out.println("Inside third if condition. " + num1 + " is less than "+ num2);
		 }
		 else
			 System.out.println("Inside last else block");
	}
}
