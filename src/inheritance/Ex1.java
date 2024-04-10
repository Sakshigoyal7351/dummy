package inheritance;
class A1
{
	public void f1()
	{
		System.out.println("f1 belongs to class A1");
	}
}

class B1 extends A1
{
	public void f2()
	{
		System.out.println("F2 beelongs to class B1");
	}
}


public class Ex1 {

	public static void main(String[] args) {
		
		
		
		B1 o2= new B1();
		o2.f2();
		o2.f1();

	}

}
