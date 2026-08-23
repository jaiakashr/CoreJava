package Day16;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("Output.txt",true);
			BufferedWriter bw = new BufferedWriter(fw); 
			bw.write("Hello Akash!");
			bw.newLine();
			bw.write("Welcome to File Handling.");
			bw.close();
			System.out.println("Success");
		}
		catch(Exception e) {
			System.out.println("Something is not right! Maybe file is missing. ");
		}
	}

}
