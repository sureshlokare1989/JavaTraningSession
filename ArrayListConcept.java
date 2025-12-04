package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		int a[] = new int[3]; //static array
		
		//dynamic array --- ArrayList
		//1. Can contain duplicate values/elements
		//2. maintains insertion order
		//3. Synchronized
		//4. allows random access to fetch the element because it stores the values on the basis of indexes
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add(60);
		ar.add("Test");
		ar.add(12.33);
		ar.add(true);
		
		System.out.println(ar.size()); //size of arraylist
		
		System.out.println(ar.get(4)); //to get the value from an index
		
		//to print all the values of an arraylist
		//1. for loop
		//2. using iterator
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//non generic vs generic
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar.add("Test");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Test");
		//ar2.add(100);
		
		Employee e1 = new Employee("Suresh", 36, "QA");
		Employee e2 = new Employee("Amey", 37, "Dev");
		Employee e3 = new Employee("Peter", 38, "Admin");
		
		ArrayList<Employee> ar3 = new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		//Iterator to traverse the values
		Iterator<Employee> it = ar3.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("*******************");
		
		//addAll
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("test");
		ar4.add("Selenium");
		ar4.add("QTP");
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Java");
		ar5.add("Javascript");
		ar5.add("c");
		
		ar4.addAll(ar5);
		
		for(int i=0;i<ar4.size();i++) {
			System.out.println(ar4.get(i));
		}
		
		System.out.println("*******************");
		
		//removeAll
		ar4.removeAll(ar5);
		
		for(int i=0;i<ar4.size();i++) {
			System.out.println(ar4.get(i));
		}
		
		//retainAll
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("test");
		ar6.add("Selenium");
		ar6.add("QTP");
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("Javascript");
		
		ar6.retainAll(ar7);
		
		System.out.println("******************");
		
		for(int i=0;i<ar6.size();i++) {
			System.out.println(ar6.get(i));
		}
	}

}
