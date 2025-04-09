package patternPrograms;

public class StarPatterns {
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * ***** 
		 */
	
	public void starPattern1(int num) {
		
		for(int i = 1; i<=num;i++) {
			for(int j = 1; j <=num ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void starPattern2(int num) {
		for(int i = 1;i<=num; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	public void starPattern3(int num) {
		for(int i =1; i<=num; i++) {
			for(int j=num;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void starPattern4(int num) {
		for(int i = 1; i<=num;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = num - 1;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
	public void starPattern4UsingWhile(int num) {
		int i = 1;
		
		boolean isIncrement = true;
		
		while(i>=0) {
			for(int j = 1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i==num) {
				isIncrement=false;
			}
			
			if(isIncrement) {
				i++;
			}else {
				i--;
			}
		}
	}
	
	
	

}
