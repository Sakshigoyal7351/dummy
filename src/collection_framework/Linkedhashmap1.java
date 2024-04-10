package collection_framework;

import java.util.LinkedHashMap;

public class Linkedhashmap1 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> m1 = new LinkedHashMap<Integer, String>();
		
		m1.put(2, "abc");
		m1.put(5, "efg");
		m1.put(6, "xyz");
		m1.put(1, "ijk");
		
		System.out.println(m1);
		
		
		System.out.println("getting value is :"+m1.get(5));
		
		System.out.println("size of map is : "+m1.size());
		
		m1.remove(5);
		System.out.println(m1);

	}

}
