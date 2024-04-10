package collection_framework;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<String> l2 = new LinkedList<String>();
		
		l2.add("Ravi");
		l2.add("vijay");
		l2.add("Ravi");
		l2.add("Ajay");
		
		for(String i:l2)
		{
			System.out.println(i);
		}
		
		l2.addFirst("sakshi");
		
		l2.addLast("shubham");

		System.out.println("after adding two more elements !!");
		
		for(String i:l2)
		{
			System.out.println(i);
		}
		
		l2.remove("Ajay");
		
		System.out.println("After removing ajay: ");
		
		for(String i:l2)
		{
			System.out.println(i);
		}
		
		l2.remove(1);
		
		System.out.println("after removing index 1 element !!");
		
		for(String i:l2)
		{
			System.out.println(i);
		}
		
		l2.removeFirst();
		l2.removeLast();
		
		System.out.println("after removing first and last element !!");
		for(String i:l2)
		{
			System.out.println(i);
		}
		
		l2.removeAll(l2);
		
		System.out.println("left element !! ");
		for(String i:l2)
		{
			System.out.println(i);
		}
	}

}
