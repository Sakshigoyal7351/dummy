package abst_encap;

interface I
{
	 int b=90;
	 void show();
	 
	public default void display()
	 {
		method2();
		 System.out.println("concrete methods ");
	 }
	
	static void method1()
	{
		
		System.out.println("static methods ");
	}
	
	private void method2()
	{
		System.out.println("private method in an interface !!");
	}
	
	
}

class T implements I
{

	@Override
	public void show() {
		
		System.out.println("this is show method!!");
		
	}
	
}


class G implements I
{

	@Override
	public void show() {
		System.out.println("second show method !!");
		
	}
	
}

public class interfaceex {

	public static void main(String[] args) {
		
		I o1 = new T();
		
		o1.show();
		
		G o2 = new G();
		o2.show();
		
		I.method1();
		o1.display();
		
	
		
	}

}
