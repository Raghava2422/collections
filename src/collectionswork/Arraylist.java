package collectionswork;

import java.util.Iterator;
import java.util.Stack;

public class Arraylist {

	public static void main(String[] args) {
		
		// ArrayList
	/*	ArrayList list1=new ArrayList();
		list1.add("Raghava");
		list1.add("Goteti");
		list1.add("Satya");
		list1.add("Satya");
		Iterator itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} */
		
		//Linked List
		
	/*	LinkedList list = new LinkedList();
		list.add(23);
		list.add("potti");
		list.add(34.98);
		list.add("A");
		list.add("potti");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} */
		
		//Vector
		
		/*Vector v = new Vector();
		v.add("Nag");
		v.add("S");
		v.add(34);
		Iterator i = v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		} */
		
		
		//Stack
		Stack s = new Stack();
		s.add("s");
		s.push("ad");
		s.push(2);
		//s.pop();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
	}

}
