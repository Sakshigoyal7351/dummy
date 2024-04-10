package oops;

class Animal
{
	static int a=100;
	static public void fun()
	{
		System.out.println("this is my method !!");
	}
}


public class staticuse {

	public static void main(String[] args) {
		
		Animal.fun();
		
		System.out.println(Animal.a);
	}

}
