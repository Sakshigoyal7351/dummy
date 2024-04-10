package constructors;

class ABC
{
	
	ABC(int a, String b)
	{
		System.out.println("this is with argument constructor");
		System.out.println(a);
		System.out.println(b);
	}
	
	public void f1()
	{
		System.out.println("i am normal method");
	}
}
public class NoArgCons {

	public static void main(String[] args) {
		
		ABC obj= new ABC(100,"sakshi");
		obj.f1();

	}

}
