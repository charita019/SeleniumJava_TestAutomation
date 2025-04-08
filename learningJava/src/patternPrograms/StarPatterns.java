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
	
	
	

}
