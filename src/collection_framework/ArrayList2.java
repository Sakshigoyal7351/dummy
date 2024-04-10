package collection_framework;

import java.util.ArrayList;

class Student
{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
}

public class ArrayList2 {

	public static void main(String[] args) {
		
		Student s1= new Student(101,"Aryan",26);
		Student s2= new Student(102,"shubham",28);
		Student s3= new Student(103,"shivam",28);
		
		
		
		ArrayList<Student> s= new ArrayList<Student>();
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		for(Student i: s)
		{
			System.out.println(i.id+"   "+i.name+"   "+i.age);
			
		}

	}

}
