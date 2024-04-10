package polymorphism;

class Loading
{
	public void m1()
	{
		System.out.println("method 1");
	}
	
	public void m1(int a)
	{
		System.out.println("method 2"+a);
	}
	public void m1(int a, double b)
	{
		System.out.println("method 3"+a+" "+b);
	}
	public void m1(double b, int a)
	{
		System.out.println("method 4"+b+" "+a);
	}
	public void m1(int a, int b)
	{
		System.out.println("method 5"+a+" "+b);
	}
	
	public void m1(int a, String b)
	{
		System.out.println("method 6"+a+" "+b);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Loading obj= new Loading();
		obj.m1();
		obj.m1(100);
		obj.m1(12.88, 10);
		obj.m1(123, 12.90);
		obj.m1(56, 70);
		obj.m1(56, "sakshi");

	}

}
