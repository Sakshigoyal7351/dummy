package reference_veriables;

class test2
{
	void m1()
	{
		System.out.println("method 1");
	}
	
	void m2()
	{
		this.m1();
		System.out.println("method 2");
	}
}


public class this2 {

	public static void main(String[] args) {
		
		test2 o1= new test2();
		o1.m2();

	}

}
