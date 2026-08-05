package Day7;

class Calculator{
	public int add(int n1, int n2) {
		int result = n1+n2;
		return result;
	}
	public int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
}

public class CompilePolymorphism {
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int r1 = obj.add(3,4);
		int r2 = obj.add(3,5,4);
		System.out.println(r1);
		System.out.println(r2);
	}

}
