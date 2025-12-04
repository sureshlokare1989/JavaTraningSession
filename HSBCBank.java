package OOPConceptPart2;

public class HSBCBank implements USBank,BrazilBank{ //we are achieving multiple inheritance
	//Is a relationship

	//If a class implementing any interface, then its mandatory to define/override all methods of an interface.
	//overriding from US Bank
	public void credit() {
		System.out.println("hsbc--credit");
	}
	
	public void debit() {
		System.out.println("hsbc--debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc--transfer money");
	}
	
	//Seperate methods
	public void educationLoan() {
		System.out.println("hsbc--education loan");
	}
	
	public void carLoan() {
		System.out.println("hsbc--car loan");
	}

	//Brazil bank method -- overriding from brazil bank
	public void mutualFund() {
		System.out.println("hsbc--mutual fund");
		
	}
}
