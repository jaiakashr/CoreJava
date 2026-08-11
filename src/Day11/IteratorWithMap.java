package Day11;
import java.util.*;

public class IteratorWithMap {
	public static void main(String[] args) {
		HashMap<Integer, String> students = new HashMap<>();

		students.put(101, "Akash");
		students.put(102, "Rahul");
		students.put(103, "Kumar");

		Iterator<Map.Entry<Integer, String>> it =
		        students.entrySet().iterator();

		while (it.hasNext()) {

		    Map.Entry<Integer, String> entry = it.next();

		    System.out.println(
		        entry.getKey() + " : " + entry.getValue()
		    );
		}
	}

}
