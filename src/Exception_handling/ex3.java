package Exception_handling;

public class ex3 {
	
	public static void validation(int age)throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("person is not eligible ");
		}
		else 
		{
			System.out.println("Person is eligible !!");
		}
	}

	public static void main(String[] args) {
	
		validation(12);

	}

}
