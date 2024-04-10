package inheritance;

class A2
{
	public void f1()
	{
		System.out.println("method of A2 class ");
	}
}

class B2 extends A2
{
	public void f2()
	{
		System.out.println("method of B2 class ");
	}
}

class C2 extends B2
{
	public void f3()
	{
		System.out.println("method of C2 class ");
	}
}

public class Ex2 {

	public static void main(String[] args) {
		
		C2 obj = new C2();
		obj.f1();
		obj.f2();
		obj.f3();

	}

}
