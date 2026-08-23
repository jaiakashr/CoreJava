package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(new File("Output.txt"));
			
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line);
				}
			scan.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Something is not right! Maybe file is missing. ");
			
		}
		
	}

}
