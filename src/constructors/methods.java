package constructors;

class B

{
	public void f1() //NANR
	{
		System.out.println("this is NANR method");
	}
	
	public String f2() //NAWR
	{
		return "Sakshi Goyal";
	}
	
	public void f3(int a) //WANR
	{
		System.out.println("a is :"+a);
	}
	
	public int f4(int z) //WAWR
	{
		return z;
	}
}

public class methods {

	public static void main(String[] args) {
		B obj = new B();
		obj.f1();
		String a=obj.f2();
		System.out.println(a);
		
		obj.f3(120);
		
		int b=obj.f4(900);
		System.out.println(b);

	}

}
