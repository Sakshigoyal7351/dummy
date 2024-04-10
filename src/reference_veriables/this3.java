package reference_veriables;

class test3
{
	test3()
	{
		this(230);
		System.out.println("default constructor !");
	}
	
	test3(int a)
	{
		
		System.out.println("parametrised constructor "+a);
	}
}

public class this3 {

	public static void main(String[] args) {
		
		
		
		test3 o1 = new test3();
	}

}
