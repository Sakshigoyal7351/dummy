package collection_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset1 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> s1= new LinkedHashSet<Integer>();
		s1.add(123);
		s1.add(321);
		s1.add(111);
		s1.add(211);
		
		int a=s1.size();
		System.out.println("size of the set is : "+a);
		
		System.out.println(s1);
		
		s1.remove(111);
		System.out.println(s1);

	}

}
