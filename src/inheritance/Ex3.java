package inheritance;

class A3
{
	public void f1()
	{
		System.out.println("method of A3");
	}
}
class B3 extends A3
{
	public void f2()
	{
		System.out.println("method of B3");
	}
}
class C3 extends A3
{
	public void f3()
	{
		System.out.println("method of C3");
	}
}

public class Ex3 {

	public static void main(String[] args) {
		
		B3 o1= new B3();
		o1.f2();
		o1.f1();
		
		C3 o2= new C3();
		o2.f3();
		o2.f1();
	}

}
