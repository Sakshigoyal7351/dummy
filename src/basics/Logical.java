package basics;

public class Logical {

	public static void main(String[] args) {
		int a=20;
		int b=10;
		
		System.out.println((a>b)&&(a<b));//(20>10)&&(20<10)--> 1 && 0--> false
		System.out.println((a>b)||(a<b));//(20>10)||(20<10)--> 1 && 0-->true
	
	
		System.out.println(!(a>b));//!(20>10)--> !true --> false
	}

}
