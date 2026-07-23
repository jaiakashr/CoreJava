package Day2;

import java.util.Scanner;

public class ifElse {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Is it raining outside? (Yes/No) : ");
		String rain = scan.nextLine();
		
		if (rain.equals("Yes")) {
			System.out.println("Take an Umbrella. ");
		}
		else if(rain.equals("No")) {
			System.out.println("Enjoy the Sunlight. ");
		}
			else {
				System.out.println("Enter Yes or No : ");
			}
	}

}
