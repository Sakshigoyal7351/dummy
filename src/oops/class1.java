package oops;

class Fruit
{
	
	int a=100;
	int b;
	public void fun()
	{
		System.out.println("Mango is sweet!!!");
	}
	
	public void fun2()
	{
		System.out.println("Mango is not sweet!!!");
	}
}


public class class1 {

	public static void main(String[] args) {
		
		Fruit mango = new Fruit();
		mango.fun();
		mango.fun2();
		
		Fruit apple= new Fruit();
		apple.fun();
		apple.fun2();

		System.out.println(mango.a);
		mango.b=200;
		System.out.println(mango.b);
	}

}
