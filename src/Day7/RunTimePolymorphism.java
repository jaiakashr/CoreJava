package Day7;

class A{
	public void show(){
		System.out.println("In A Show");
	}
	public void config() {
		System.out.println("In A Config");
	}
}

class B extends A{
	public void show(){
		System.out.println("In B Show");
	}
	
}

public class RunTimePolymorphism {
	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		obj.config();
		
	}

}
