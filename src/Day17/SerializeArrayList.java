package Day17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Student implements Serializable{
	
	int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {

        this.id = id;
        this.name = name;
        this.marks = marks;

    }
}

public class SerializeArrayList {
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(101,"Akash",100));
		students.add(new Student(102,"Abi",100));
		
		try(
				ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("students.ser") )
				)
		{
			output.writeObject(students);
			System.out.println("Students saved Successfully.. ");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
