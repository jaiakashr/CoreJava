package Day11;
import java.util.*;

public class IteratorWithLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);

		Iterator<Integer> it = numbers.iterator();

		while (it.hasNext()) {

		    System.out.println(it.next());

		}
	}

}
