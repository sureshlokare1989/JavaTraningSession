package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	String name = "Tom"; // non static variable
	static int age = 25; // static variable

	public static void main(String[] args) {
		
		//how to call static methods and variables
		//1. direct calling
		sum();
		//2. calling by classname
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non static methods and variables
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access static methods by using object refernece? Yes
		obj.sum();
	}
	
	public void sendMail() {  //non static method
		System.out.println("Send mail method");
	}
	
	public static void sum() {  //static method
		System.out.println("sum method");
	}

}
