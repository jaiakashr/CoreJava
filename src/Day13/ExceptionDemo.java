package Day13;

public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 0;
		
		try {
			int arr[] = null;
			System.out.println(arr[1]);
			c = a/b;
		}
		catch(ArithmeticException e) {
			System.err.println("Arithmetic Exception has occured ");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.err.println("Null pointer Exception has occured ");
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println("Error Occured. ");
			e.printStackTrace();
		}
		finally {
			System.out.println("try block complleted..");
		}
		
		System.out.println(c);
		System.out.println("Thank you... ");
	}
}
