package collection_framework;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		
		NavigableSet<Integer> t1= new TreeSet<Integer>();
		
		t1.add(133);
		t1.add(123);
		t1.add(111);
		t1.add(141);
		
		
		System.out.println(t1);
		
		t1.remove(123);
		
		System.out.println(t1);
		
		t1.pollFirst();
		t1.pollLast();
		System.out.println(t1);
		

	}

}
