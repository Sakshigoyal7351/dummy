package reference_veriables;

class O1
{
	O1()
	{
		System.out.println("o1 constructor !");
	}
}
class O2 extends O1
{
	O2()
	{
		super();
		System.out.println("o2 constructor !");
	}
}

public class super3 {

	public static void main(String[] args) {
		
		O2 obj= new O2();
		
		
		

	}

}
