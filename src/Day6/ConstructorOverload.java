package Day6;

public class ConstructorOverload {
	
	int marks;
	String name;
	
	ConstructorOverload(int a, String b){
		marks = a;
		name = b;
		
	}
	
	public static void main(String[] args) {
		
		ConstructorOverload obj1 = new ConstructorOverload(79,"Akash");
		ConstructorOverload obj2 = new ConstructorOverload(50,"Abi");

		System.out.println(obj1.marks);
		System.out.println(obj2.marks);
		
	}

}
