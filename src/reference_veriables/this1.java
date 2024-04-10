package reference_veriables;

class test
{
	int b;
	
	void seta(int a)
	{
		this.b=a;
	}
	
	void show()
	{
		System.out.println(b);
	}
}


public class this1 {

	public static void main(String[] args) {
		
		test o = new test();
		o.seta(20);
		o.show();

	}

}
