package Day17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
	
	public static void main(String[] args) {
		try(
				FileInputStream file = new FileInputStream("student.ser");
				ObjectInputStream input = new ObjectInputStream(file);
				)
		{
			Students student = (Students)input.readObject();
			System.out.println("ID : " + student.id);
			System.out.println("NAME : " + student.name);
			System.out.println(("MARKS : " + student.marks));
		}
		catch(IOException | ClassNotFoundException e) {
			
		}
	}
}
