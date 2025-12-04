package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.carLoan();
		hs.educationLoan();
		hs.mutualFund();
		
		System.out.println("****************");
		
		//dynamic polymorphism
		//child class can be referred by parent interface reference variable
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
	}

}
