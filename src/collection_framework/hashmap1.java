package collection_framework;

import java.util.HashMap;

public class hashmap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		
		m1.put(4, "sakshi");
		m1.put(2, "Megha");
		m1.put(1, "sachin");
		m1.put(6, "naina");

		
		System.out.println(m1);
		
		int a=m1.size();
		System.out.println(a);
		
		if(m1.containsKey(2))
		{
			System.out.println("key is present !!");
		}
		
		
		if(m1.containsValue("sakshi"))
		{
			System.out.println("value is present !");
		}
		
		m1.remove(4);
		System.out.println(m1);
	}

}
