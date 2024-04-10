package collection_framework;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
	HashSet<String> s1 = new HashSet<String>();
	
	s1.add("volvo");
	s1.add("BMW");
	s1.add("ford");
	s1.add("BMW");
	s1.add("Mazda");
	
	System.out.println(s1);
	
	if(s1.contains("BMW"))
	{
		System.out.println("BMW is present !!");
	}
	
	else
	{
		System.out.println("BMW is not present !");
	}

	s1.remove("volvo");
	
	System.out.println(s1);
	
//	s1.clear();
//	
//	System.out.println(s1);
	
	
	int a=s1.size();
	System.out.println(a);
	
	}

}
