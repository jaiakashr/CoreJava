package Day11;
import java.util.*;

public class IteratorWithHashSet {
	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();

		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");

		Iterator<String> it = fruits.iterator();

		while (it.hasNext()) {

		    System.out.println(it.next());

		}
	}

}
