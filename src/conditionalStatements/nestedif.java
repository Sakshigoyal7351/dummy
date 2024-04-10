package conditionalStatements;

public class nestedif {

	public static void main(String[] args) {
		

		int n=19;
		
		
		if(n%3==0)
		{
			if(n%5==0)
			{
				System.out.println("a is divisible by 3 and 5 both !!!");
			}
		}
		else
		{
			System.out.println("not divisible !!");
		}
	}

}
