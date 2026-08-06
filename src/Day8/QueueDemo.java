/* Collections - Queue */

package Day8;
import java.util.*;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(8);
		q.add(12);
		q.add(14);
		q.add(15);
		
		System.out.println("Head is "+ q.peek());
		System.out.println("Removed " + q.remove());
		System.out.println("Head is "+ q.peek());
		q.size();
	
	}

}
