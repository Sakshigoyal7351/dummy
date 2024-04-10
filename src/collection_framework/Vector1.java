package collection_framework;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector<Integer> v1= new Vector<Integer>();
		
		v1.add(120);
		v1.add(113);
		v1.add(140);
		v1.add(60);
		
		
		System.out.println(v1);
		
		v1.addElement(150);
		v1.addElement(45);
		
		System.out.println(v1);
		
		if(v1.contains(150))
		{
			System.out.println("150 is present !");
		}
		else
		{
			System.out.println("150 is not present !");
		}
		
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		
		v1.remove(1);
		
		System.out.println(v1);
		
		v1.removeElementAt(2);
		
		System.out.println(v1);
	}

}
