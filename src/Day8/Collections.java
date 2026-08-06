/* Collections - ArrayList and LinkedList */

package Day8;
import java.util.*;

public class Collections {
	public static void main(String[] args) {
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			intlist.add(i);
		}
		intlist.add(24);
		intlist.set(7, 35);
		System.out.println(intlist);
		
		
		ArrayList<String> strlist = new ArrayList<String>();
		strlist.add("Akash");
		strlist.add("Deva");
		System.out.println(strlist);
		
		LinkedList<Integer> lists = new LinkedList<Integer>();
		for(int j=18; j<=23; j++ ) {
			lists.add(j);
		}
		lists.addLast(24);
		System.out.println(lists);
	}

}
