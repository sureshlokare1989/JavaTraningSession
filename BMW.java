package OOPConceptPart2;

public class BMW extends Car {

	//when same methods are present in parent as well as child class with the same name and same number of arguments is called Method Overriding.
	public void start() {
		System.out.println("BMW---start");
	}
	
	public void theftSafety() {
		System.out.println("BMW---theftsafety");
	}
	
}
