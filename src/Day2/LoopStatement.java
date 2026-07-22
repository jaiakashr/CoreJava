package Day2;

import java.util.Scanner;

public class LoopStatement {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 5; i>=1; i=i-1) {
			System.out.println(i);
		}
		
		int j=1;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		
		int k=1;
		do {
			System.out.println("Akash");
			k = k+1;
		}while(k<=4);
	}	

}
