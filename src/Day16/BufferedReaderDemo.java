package Day16;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Output.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
		//ystem.out.print(line);
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		}
		catch(Exception e) {
			System.out.println("Something is not right! Maybe file is missing. ");
		}
	}
}
