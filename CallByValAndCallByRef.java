package OOPConceptPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20;
		obj.testsum(x, y); //call by value or pass by value
		
		
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		//after swapping
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public int testsum(int a, int b) {
		
		int c = a+b;
		return c;
	}
	
	//Call by reference
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
	}

}
