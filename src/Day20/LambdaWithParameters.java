package Day20;

interface Calculate{
	int add(int a, int b);
}

public class LambdaWithParameters {
	public static void main(String[] args) {
		
		Calculate cal = (a,b) ->{
			return a +b ;
		};
		
//		Calculate cal = (a,b) -> (a+b);
//		you can write this type also... its called expression lambda
		
		System.out.println(cal.add(6, 8));
	}
}
