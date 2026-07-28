package Day4;

import java.util.Scanner;

public class array {
	
	public static void main(String[] args) {
	
		String[] playlist = new String[3];
		
		playlist[0] = "Song 1";
		playlist[1] = "Song 2";
		playlist[2] = "Song 3";
		
		//String[] playlist = {"Song 1","Song 2","Song 3"};
		
		System.out.println(playlist[0]);
		System.out.println(playlist[1]);
		System.out.println(playlist[2]);
		
		//getting input in array
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();
		
		System.out.println("Getting input in array");
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = new int[5];
		System.out.println("Enter any numbers to add : ");
		
		score[0] = scan.nextInt();
		score[1] = scan.nextInt();
		score[2] = scan.nextInt();
		score[3] = scan.nextInt();
		score[4] = scan.nextInt();
		
		System.out.println(score[0]+score[1]+score[2]+score[3]+score[4]);
	}

}
