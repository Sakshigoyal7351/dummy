package abst_encap;

abstract class vehicle{
	
	abstract void start();
}

class car extends vehicle
{

	
	void start() {
		System.out.println("car starts through keys !");
		
	}
	
}

class scooter extends vehicle
{

	
	void start() {
		System.out.println("scooter starts through kick !");
		
	}
	
}


public class Abstractclass {

	public static void main(String[] args) {
		
		car c= new car();
		c.start();
		
		scooter s= new scooter();
		s.start();

	}

}
