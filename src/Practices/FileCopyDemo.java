package Practices;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyDemo {
	public static void main(String[] args) {
		
		try (
			FileReader reader = new FileReader("Output.txt");
			FileWriter writer = new FileWriter("OutputDemo.txt");
		)
		{
			int data;
			
			while((data = reader.read()) != -1) {
				writer.write(data);
			}
			
			System.out.println("File Copied Successfully. ");
		}
		catch(IOException e) {
			System.out.println("Something is not right! Maybe file is missing. ");
		}
	}
}
