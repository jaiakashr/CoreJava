package Day5;

public class StringBufferAndBuilder {
	
	public static void main(String[] args) {
		{
			StringBuffer sb = new StringBuffer("Akash");
			sb.append(" Nandhini");
			System.out.println(sb);
			System.out.println(sb.capacity());
			System.out.println(sb.length());
		}
	}

}
