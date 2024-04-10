package constructors;

class AB
{
	int a;
	String b;
	
	AB()
	{
		System.out.println("no arg constructor working ! ");
	}
	
	public AB(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
}

public class WithArgConst {

	public static void main(String[] args) {
		
		AB obj = new AB(10,"sakshi");
		
		AB obj2= new AB();
		
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}
