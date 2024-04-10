package Exception_handling;

public class ex2 {

	public static void main(String[] args) {
		
		try
		{
			int z[]= {1,4,6,8,5};
			
			System.out.println(z[5]);
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception occurs !!");
			
			
		}
		
		catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occurs ");
		}

	}

}
