package Day20;

interface A{
	void display();
}

public class LambdaExpression {
	
	public static void main(String[] args) {
		
		A obj = () -> {
				System.out.println(" Hi Everybody.. ");
			};
		
//		A obj = new A() {
//
//			@Override
//			public void display() {
//				System.out.println(" Hi Everybody.. ");
//				
//			}
//			
//		};
		
		obj.display();
	}

}
