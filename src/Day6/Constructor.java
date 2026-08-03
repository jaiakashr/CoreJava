package Day6;

//Constructor

public class Constructor {
	
	int marks;
	String names;
	
	Constructor(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Constructor ob1 = new Constructor();
		Constructor ob2 = new Constructor();
		
		System.out.println(ob1.marks);
		System.out.println(ob2.marks);
		
		
	}

}
