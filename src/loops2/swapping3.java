package loops2;

public class swapping3 {

	public static void main(String[] args) {
	
		int a=20;
		int b=10;
		
		System.out.println("before sqapping :");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("After swapping :");
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
