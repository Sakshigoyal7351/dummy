package Exception_handling;

public class ex1 {

	public static void main(String[] args) {
		
		
		try
		{
			int a=10;
			int b=5;
			int c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("there is exception in my code !!");
		}
		finally {
			System.out.println("final block executed !");
		}
		

	}

}
