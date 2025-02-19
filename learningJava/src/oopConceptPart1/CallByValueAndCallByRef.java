package oopConceptPart1;

public class CallByValueAndCallByRef {
	int p;
	int q;

	public static void main(String[] args) {
		int x=10;
		int y=20;
		CallByValueAndCallByRef obj=new CallByValueAndCallByRef();
		System.out.println(obj.testSum(x,y)); //call by value OR Pass by value
		
		obj.p=50;
		obj.q=60;
		System.out.println("Before Swap : "+ obj.p + " " + obj.q);
		obj.swap(obj);
		System.out.println("After Swap : ");
		System.out.println(obj.p);
		System.out.println(obj.q);
		

	}
	
	public int testSum(int a, int b) {
		a=30; b=40;
		int c=a+b;
		return c;
	}
	
	public void swap(CallByValueAndCallByRef t) {
		int temp;
		temp=t.p; //50
		t.p=t.q; // 60
		t.q=temp; //50
		
	}

}
