package Day6;
//Parameterized Cinstructor



public class Student {
	
	int marks;
	String name;
	
	Student(){
		System.out.println("Empty Constructor");
	}
	Student(int a) {
		System.out.println(a);
		System.out.println("Hello");
	}
    public static void main(String[] args) {
    	Student ob1 = new Student(10);
    	Student ob2 = new Student();
    	
	
	}
     
}
