package abst_encap;

interface I1
{
	void show();
	void method1();
}

interface I2
{
	void display();
	void method1();
}

class C3 implements I1, I2
{

	@Override
	public void display() {
		System.out.println("display method !");
		
	}

	@Override
	public void show() {
		System.out.println("show method !");
		
	}

	@Override
	public void method1() {
		System.out.println("method same !!");
		
	}
	
	
}

public class multipleinh {

	public static void main(String[] args) {
		
		C3 obj = new C3();
		
		obj.show();
		obj.display();
		obj.method1();

	}

}
