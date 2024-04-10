package Array;

import java.util.Scanner;

public class singleD {

	public static void main(String[] args) {
		
		int a[]= new int[5];
		int b[]= new int[5];
		int c[]= new int[5];
		int i;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the elements of a array !!");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the elements of b array !!");
		for(i=0;i<5;i++)
		{
			b[i]=sc.nextInt();
		}
		
	System.out.println("the values of A array are : ");
		
		for(i=0;i<5;i++)
		{
			System.out.print(a[i]+"   ");
			
		}
		
		System.out.println("\n");
		
		System.out.println("the values of B array are : ");
		
		for(i=0;i<5;i++)
		{
			System.out.print(b[i]+"   ");
		}
		
		
		for(i=0;i<5;i++)
		{
			c[i]=a[i]+b[i];
		}
		
		System.out.println("\n");
		
		System.out.println("Sum of A and B array are : ");
		
		for(i=0;i<5;i++)
		{
			System.out.print(c[i]+"   ");
		}
		

	}

}
