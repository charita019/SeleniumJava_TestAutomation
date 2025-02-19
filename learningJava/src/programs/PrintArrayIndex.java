package programs;

public class PrintArrayIndex {

	public static void main(String[] args) {
		int a[]=new int[6];
		a[0]=6;
		a[1]=8;
		a[2]=11;
		a[3]=6;
		a[4]=7;
		a[5]=18;
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		int target=17;
		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length;j++) {
				if((a[i]+a[j])==target) {
					System.out.println("Index are :" + i + " " + j);
			}

			}
		}
	}
}
