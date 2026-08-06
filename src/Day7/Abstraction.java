package Day7;

abstract class Vehicle{
	abstract void speed();
	
	void brand() {
		System.out.println("XYZ Brand");
	}
}

class Bike extends Vehicle{
	void speed(){
		System.out.println("95km/hr");
	}
}

public class Abstraction {
	
	public static void main(String[] args) {
		Vehicle bike = new Bike();
		bike.speed();
		bike.brand();
		
	}

}
