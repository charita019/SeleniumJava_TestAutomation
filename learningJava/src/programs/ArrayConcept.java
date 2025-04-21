package programs;

public class ArrayConcept {

	public static void main(String[] args) {
		// 1-Dimensional Array (1-Dim array)
		//1. integer array
		int i[]=new int [5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]); //array index out of bounds exception 5th value does not exist
		
		//size or length of array
		System.out.println(i.length);
		
		//print all the values of array
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//2. double array
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=13.44;
		d[2]=45.55;
		
		System.out.println(d[2]);
		
		//3. character array
		char c[]=new char[3];
		c[0]='a';
		c[1]=2;
		c[2]='$';
		
		//4. boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5. String Array
		String s[]=new String[3];
		s[0]="Test";
		s[1]="hello";
		s[2]="world";
		
		//size of array
		System.out.println(s.length);
		System.out.println(s[1]);
		
		//disadvantages of array
		//1. size is fixed -- static array - To overcome this prob : Collections {arrayList,HashTable, -- use dynamic array}
		//2. only stores similar data types -- to overcome this, we use object array
		
		
		//6. Object Array - to store different data types values
		//Object (Is a class)- super class of all classes in Java
		
		Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]='M';
		ob[5]="London";
		
		System.out.println(ob[5]);
		
		for(int k=0;k<ob.length;k++) {
			System.out.println(ob[k]);
		}
	}
}
