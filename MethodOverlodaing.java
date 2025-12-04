package OOPConceptPart1;

public class MethodOverlodaing {

	public static void main(String[] args) {
	
		MethodOverlodaing obj = new MethodOverlodaing();
		obj.sum();
		obj.sum(20);
		obj.sum(10, 5);
		}

	//you can not create method inside method.
	//duplicate methods---same method name with same number of arguments are not allowed.
	
	//Mehtod overloading---method name is same with different input parameters or arguments within the same class
	
	public void sum() {
		System.out.println("sum method --- with no parameter");
	}

	public void sum(int i) {
		System.out.println("sum method --- with 1 parameter");
		System.out.println(i);
	}
	
	public void sum(int k, int l) {
		System.out.println("sum method --- with 2 parameters");
		System.out.println(k+l);
	}
}
