package Day15;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerWithFileWriter {
	  public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter student name: ");
	        String name = input.nextLine();

	        try (FileWriter writer =
	                new FileWriter("students.txt")) {

	            writer.write(name + "\n");

	            System.out.println(
	                "Student saved successfully."
	            );

	        }
	        catch (IOException e) {

	            System.out.println(
	                "Error: " + e.getMessage()
	            );

	        }

	        input.close();
	    }

}
