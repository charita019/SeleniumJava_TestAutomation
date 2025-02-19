package learningJava;

public class MultiDimArray {

	public static void main(String[] args) {
		
		int[][] multidimArray=new int[2][3];
		multidimArray[0][0]=2;
		multidimArray[0][1]=3;
		multidimArray[0][2]=5;
		multidimArray[1][0]=6;
		multidimArray[1][1]=8;
		multidimArray[1][2]=9;
		
		int[][] multidimarry1= {{2,3,5},{6,8,9}};
		
		for(int i=0;i<multidimarry1.length;i++) {
			for(int j=0;j<multidimarry1[i].length;j++) {
				System.out.println(multidimarry1[i][j]);
			}
		}
		
		
	}

}
