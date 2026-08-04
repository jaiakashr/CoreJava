package Day7;

// INHERITANCE and its types - Single Inheritance, Multilevel Inheritance, Heirarical inheritance and Hybrid Inheritance

class Mobile{
	int price = 72000;
	void use() {
	System.out.println("It has display");
	}
}

class Laptop extends Mobile{
	String name = "HP";
}

class Computer extends Laptop{
	int ram = 16; 
}

class Television extends Mobile{
	String display = "OLED";
}
public class MainClass {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();	
		l1.use();
		System.out.println(l1.price);
		Computer com = new Computer();
		System.out.println(com.price);
		Television tv = new Television();
		System.out.println(tv.price);
		

	}

}
