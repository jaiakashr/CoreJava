package Day15;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterDemo {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("Output.txt");
			fw.write("Hello Akash!");
			fw.close();
			System.out.println("Success");
		}
		catch(Exception e) {
			System.out.println("Something is not right! Maybe file is missing. ");
		}
	}

}
