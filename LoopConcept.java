package JavaBasics;

public class LoopConcept {

	public static void main(String[] args) {
	
		//1. While Loop
		//disadvantage of while loop is that it will generate infinite loop if we dont give incremental/decremental part
		
		int i = 1; // initilization
		while(i <= 10) { // conditional
			System.out.println(i);
			i++;  //incremental/decremental
		}
		
		
		System.out.println("**************");
		
		//2. for Loop
		
		for(int j = 1; j<=10; j++) {  //Initialization, conditional, incremental
			System.out.println(j);
		}
		
		System.out.println("**********");
		
		for(int k = 10; k>=-10; k--) {
			System.out.println(k);
		}
	}

}
