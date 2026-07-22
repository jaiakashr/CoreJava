package Day1;

import java.util.Scanner;

public class VariablesDataypesOperators {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String Name = "Akash";
		int Today = 14072026;
		
		System.out.println("Enter the A value : ");
		int a = scan.nextInt();
		System.out.println("Enter the B value : ");
		int b = scan.nextInt();


		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		
//		System.out.println(num);
		System.out.println(Name);
		System.out.println("Today " +Today+ " " + Name+ " restaring his Java self learning. " );
		System.out.println("ADDITION " + add);
		System.out.println("SUBTRACTION " +sub);
		System.out.println("MULTIPLICATION " +mul);
		System.out.println("Division "+div);
		
		
		
	}

}
