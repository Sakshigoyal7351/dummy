package collection_framework;

import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> m1 = new TreeMap<Integer, String>();
		
		m1.put(7, "abc");
		m1.put(5, "xyz");
		m1.put(9, "efg");
		
		System.out.println(m1);
		
		System.out.println("value of key 5 is :"+m1.get(5));
		
//		m1.remove(9);
//		System.out.println(m1);
		
		for(Integer k:m1.keySet())
		{
			System.out.println("key : "+k+" value : "+m1.get(k));
		}

	}

}
