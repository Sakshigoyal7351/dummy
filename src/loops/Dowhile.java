package loops;

public class Dowhile {

	public static void main(String[] args) {
		
//		int i;
//		i=1;
//		
//		do
//		{
//			if(i%2==0)
//			{
//				System.out.println(i);
//			}
//			
//			i++;
//		}
//		while(i<=100);

		
		int i;
		int sum=0;
		i=1;
		do
		{
			System.out.println(i);
			sum=sum+i;
			i++;
		}
		while(i<=5);
		
		System.out.println("sum ="+sum);
	}

}
