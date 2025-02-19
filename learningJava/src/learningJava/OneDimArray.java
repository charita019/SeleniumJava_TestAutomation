package learningJava;

public class OneDimArray {

	public static void main(String[] args) {
		
		int[] myIntArray=new int[10]; 
		myIntArray[0]=10;
		myIntArray[1]=30;
		myIntArray[2]=20;
		myIntArray[3]=40;
		//System.out.println(myIntArray[0]);
		//System.out.println(myIntArray.length);
		
		int[] myIntArr1= {10,20,30,40};
		//System.out.println(myIntArr1[2]);
		
		for(int i=0;i<myIntArr1.length;i++) {
			System.out.println(myIntArr1[i]);
		}
		
		String[] strarr=new String[5];
		strarr[0]="James";
		strarr[1]="jon";
		String[] names= {"abc","def","ghi"};
		for(int j=0;j<names.length;j++) {
			System.out.println(names[j]);
		}
	}

}
