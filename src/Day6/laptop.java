package Day6;

public class laptop {
	
	String name = "";
	String proces = "";
	int ram = 0;
	int price = 0;
	
	public static void main(String[] args) {
		laptop lap1 = new laptop();
		lap1.name = "HP";
		lap1.proces = "AMD Ryzon 7";
		lap1.ram = 16;
		lap1.price = 66000;
		
		laptop lap2 = new laptop();
		lap2.name = "Lenovo";
		lap2.proces = "i5";
		lap2.ram = 8;
		lap2.price = 69000;
		
		System.out.println(lap1.price);
		
		laptop lap3 = new laptop();
		
		System.out.println(lap3.price);
	}

}
