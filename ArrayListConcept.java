package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		
		ar.add("Suresh");
		ar.add(12.33);
		ar.add("Hello");
		ar.add('S');
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		
		System.out.println("****************");
		
		//to print all the values present in arraylist
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Suresh");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Suresh");
		//ar2.add(100);
	}

}
