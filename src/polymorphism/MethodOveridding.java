package polymorphism;

class O1
{
	public void m1()
	{
		System.out.println("method 1");
	}
	public void m1(int a)
	{
		System.out.println("method 2"+" "+a);
	}
	
	public void m1(int a, double b)
	{
		System.out.println("method 3"+" "+a+" "+b);
	}
}
class O2 
{
	public void m1()
	{
		System.out.println("o2 method 1 ");
	}
	public void m1(int a)
	{
		System.out.println("o2 method 2"+" "+a);
	}
	
	public void m1(int a, double b)
	{
		System.out.println("o2 method 3"+" "+a+" "+b);
	}
}


public class MethodOveridding {

	public static void main(String[] args) {
		
		O2 o = new O2();
		o.m1();
		o.m1(100);
		o.m1(100, 2.90);
		
		O1 o2 = new O1();
		o2.m1();
		o2.m1(100);
		o2.m1(100, 2.90);

	}

}
