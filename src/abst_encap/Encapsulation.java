package abst_encap;

class E
{
	private int a;
	private double b;
	private String c;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		
		E obj = new E();
		
		obj.setA(100);
		obj.setB(12.33);
		obj.setC("sakshi");
		
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		System.out.println(obj.getC());
		

	}

}
