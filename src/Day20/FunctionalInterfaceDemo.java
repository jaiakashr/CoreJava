package Day20;


interface calculator{
	int calc(int a, int b);
}

public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		
		calculator add = (a,b) -> a+b;
		calculator sub = (a,b) -> a-b;
		calculator mul = (a,b) -> a*b;
		calculator div = (a,b) -> a/b;
		
		System.out.println(add.calc(9, 5));
		System.out.println(sub.calc(9, 5));
		System.out.println(mul.calc(9, 5));
		System.out.println(div.calc(9, 5));
		
		
	}

}
