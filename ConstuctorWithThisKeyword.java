package JavaBasics;

public class ConstuctorWithThisKeyword {
	
	//class variables
	String name;
	int age;
	
	public ConstuctorWithThisKeyword(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
	
		ConstuctorWithThisKeyword obj = new ConstuctorWithThisKeyword("Suresh", 30);
	}

}
