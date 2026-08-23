package Day15;

import java.io.FileReader;

public class FileReaderDemo {
	
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Output.txt");
			int c = fr.read();
		
			while(c != -1) {
				System.out.print((char)c);
				c=fr.read();
			}
			fr.close();
		}
		catch(Exception e) {
			System.out.println("Something is not right! Maybe file is missing. ");
		}
	}
}
