package loops2;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,i,f=1;
		
		System.out.println("enter the number : ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
//			f=f*i;
			f*=i;
		}
		
		System.out.println("factorial of number is : "+f);

	}

}
