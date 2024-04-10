package reference_veriables;

class M1
{
	int a=10;
}
class M2 extends M1
{
	int a=20;
	void show(int a)
	{
		System.out.println(this.a);
		
	}
}


public class super1 {

	public static void main(String[] args) {
		M2 obj = new M2();
		obj.show(30);

	}

}
