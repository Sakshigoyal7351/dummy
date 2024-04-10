package reference_veriables;

class N1
{
	void m1()
	{
		System.out.println("m1 method !!");
	}
}

class N2 extends N1
{
	void m1()
	{
		System.out.println("M1 method of N2 class");
	}
	void m2()
	{
		super.m1();
	}
}

public class super2 {

	public static void main(String[] args) {
		N2 obj = new N2();
		obj.m2();

	}

}
