package Day7;

class Person {
	private String FirstName;
	private String LastName;
	private int Age;
	
	public String getFirstName() {
		return this.FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	
	public String getLastName() {
		return this.LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	
	public int getAge() {
		return this.Age;
	}
	public void setAge(int Age) {
		if(Age >= 18) {
			this.Age = Age;
		}else
			System.out.println("InValid Age");
	}
}
public class GetterAndSetter {
	public static void main(String[] args) {
		
		Person person = new Person(); 
		
		person.setFirstName("Akash");
		System.out.println(person.getFirstName());
		
		person.setLastName("R");
		System.out.println(person.getLastName());
		
		person.setAge(23);
		System.out.println(person.getAge());
		
	}

}
