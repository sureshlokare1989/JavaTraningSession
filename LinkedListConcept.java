package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("test");
		ll.add("QA");
		ll.add("selenium");
		ll.add("qtp");
		ll.add("RFT");
		
		System.out.println("Contents of the linked list are: " + ll);
		
		//addfirst
		ll.addFirst("Naveen");
		
		//addlast
		ll.addLast("Automation");
		
		System.out.println("Contents of the linked list are: " + ll);
		
		//get		
		System.out.println(ll.get(0));
		
		//set
		ll.set(0, "Suresh");
		System.out.println(ll.get(0));
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of the linked list are: " +ll);
		
		ll.remove(2);
		System.out.println("Contents of the linked list are: "+ll);
		
		//how to print all the values of linked list
		//for loop
		
		System.out.println("\nUsing for loop");
		for(int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		
		System.out.println("\nUsing advanced for loop");
		for(String str : ll) {
			System.out.println(str);
		}
		
		System.out.println("\nUsing Iterator");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nUsing While loop");
		
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
			
	}

}
