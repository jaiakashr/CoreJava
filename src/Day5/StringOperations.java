package Day5;

public class StringOperations {
	
	public static void main(String[] args) {
		
		System.out.println("String Operations");
		System.out.println();
        String text = "Java Programming";

        System.out.println("Length: " + text.length());
        System.out.println("Char at index 2: " + text.charAt(2));
        System.out.println("Substring (0-4): " + text.substring(0, 4));
        System.out.println("Contains 'Pro': " + text.contains("Pro"));
        System.out.println("Starts with 'Java': " + text.startsWith("Java"));
        System.out.println("Ends with 'ing': " + text.endsWith("ing"));
        System.out.println("Replace: " + text.replace("Java", "Python"));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Trimmed: " + "   Hello   ".trim());
        
        System.out.println();
        System.out.println("StringBuilder and StringBuffer Methods");
        System.out.println();
        
        StringBuilder sb = new StringBuilder("Java ");
        sb.append("Language");
        sb.insert(4," Programing");
        //sb.reverse();
        //sb.replace(0,4,"Core");
        //sb.delete(4,13);
        
        
        System.out.println(sb);
        
    }	    

}
