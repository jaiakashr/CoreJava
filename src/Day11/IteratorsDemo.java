package Day11;
import java.util.*;

public class IteratorsDemo {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Akash");
		names.add("Bala");
		names.add("Jeeva");
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			if (name.equals("Jeeva")) {
		        it.remove();
		    }
			}
		System.out.println(names);
		
	}
}
