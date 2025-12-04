package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a = 30;
		int b = 20;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		// comparison operators
		// < > <= >= == !=
		
		int c = 40;
		int d = 30;
		
		if(c==d) {
			System.out.println("c and d are equal");
		}
		else {
			System.out.println("c and d are not equal");
		}
		
		//Write a logic to find the greatest number
		//Nested if else
		
		int a1 = 400;
		int b1 = 600;
		int c1 = 300;
		
		if(a1>b1 & a1>c1) {
			System.out.println("a is greatest");
		}
		else if(b1>c1) {
			System.out.println("b is greatest");
		}
		else {
			System.out.println("c1 is greatest");
		}
	}

}
