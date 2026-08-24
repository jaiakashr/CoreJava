package Day17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		
		Students student = new Students(502,"Akash", 98);
		try (
			FileOutputStream File = new FileOutputStream("student.ser");
			ObjectOutputStream output = new ObjectOutputStream(File);
		)
		{
			output.writeObject(student);
			System.out.println("Object serialized successfully..");
		}
		catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
			
		}
		
	}
}
