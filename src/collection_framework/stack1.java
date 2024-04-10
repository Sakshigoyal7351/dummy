package collection_framework;

import java.util.Stack;

public class stack1 {

	public static void main(String[] args) {
		
		Stack<Integer> s1= new Stack<Integer>();
		
		s1.push(23);
		s1.push(134);
		s1.push(35);
		s1.push(100);
		
		
		System.out.println(s1);
		
		if(s1.empty())
		{
			System.out.println("Stack is empty");
		}
		else 
		{
			System.out.println("Stack is not empty !");
		}
		
		s1.pop();
		System.out.println(s1);
		
		int l=s1.search(23);
		
		System.out.println("location of 23 is : "+l);
		
		int a=s1.size();
		System.out.println("size of stack is :"+a);

	}

}
