package collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist1 {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("Mango");
		l1.add("apple");
		l1.add("orange");
		
		System.out.println(l1);
		
//		Iterator itr =l1.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		l1.set(1, "watermalon");
		
		
		Collections.sort(l1);
		for(String i:l1)
		{
			System.out.println(i);
		}

	}

}
