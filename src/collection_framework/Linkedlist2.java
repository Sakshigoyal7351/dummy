package collection_framework;

import java.util.LinkedList;
import java.util.List;

class Book
{
	int id;
	String name, author;
	int price;
	public Book(int id, String name, String author, int price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	
}

public class Linkedlist2 {

	public static void main(String[] args) {
	
		Book b1 = new Book(101,"C language","ABC",700);
		Book b2 = new Book(102,"C++","ABC2",800);
		Book b3 = new Book(103,"Java","ABC3",900);
		Book b4 = new Book(104,"Python","ABC4",750);
		
		LinkedList<Book> l1= new LinkedList<Book>();
		
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		l1.add(b4);
		
		for(Book b:l1)
		{
			System.out.println(b.id+"  "+b.name+"  "+b.author+"  "+b.price);
		}
		

	}

}
