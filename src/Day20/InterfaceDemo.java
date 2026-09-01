package Day20;

interface Animal{
	int mark = 10;
	void sound();
}

class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("Meowww... ");
	}
	
}

public class InterfaceDemo {
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		System.out.println(cat.mark);
	}

}
