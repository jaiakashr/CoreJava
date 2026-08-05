package Day7;

class Human{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String b) {
		name = b;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Human human = new Human();
		human.setAge(23);
		human.setName("Akash");
		
		System.out.println(human.getName() + " : " + human.getAge());
	}

}
