package Day17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeSerializeArrayList {
	
	public static void main(String[] args) {
		
		try(
				ObjectInputStream input = new ObjectInputStream(new FileInputStream("students.ser"));
				)
		{
			ArrayList<Student> students = (ArrayList<Student>) input.readObject();
			
			for(Student student :  students) {
				System.out.println(student.id + " " + student.name + " " + student.marks);
			}
		}
		catch(IOException | ClassNotFoundException e){
			
		}
	}
}
