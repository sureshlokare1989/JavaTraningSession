package JavaBasics;

public class B extends A {
	
	public B() {
		super();
	}

	public B(int i) {
		super(10);  //Super keyword is used to call the parent class constructor
		//System.out.println("child class constructor");
	}
	
	public B(int i, int j) {
		super(10, 20);
	}
	
	public static void main(String args[]) {
		
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10,20);
	}
}
