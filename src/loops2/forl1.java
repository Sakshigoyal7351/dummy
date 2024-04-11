package loops2;

import java.util.Scanner;

public class forl1 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number  :");
		n=sc.nextInt();
		int i,t=0;
		
		for(i=1;i<=10;i++)
		{
			t=n*i;
			System.out.println(n+"x"+i+"="+t);
		}

	}

}
