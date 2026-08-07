package Day10;
import java.util.*;


public class MapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> names = new HashMap<>();
		names.put(101, "Akash");
		names.put(102, "Nandhini");
		names.put(103, "Girija");
		names.put(104, "Shneha");
		
		System.out.println(names);
		System.out.println(names.get(103));
		
//		for(int key : names.keySet()) {
//			System.out.println(key + " : " +names.get(key));
//		}
		
		for(Map.Entry<Integer, String> entry : names.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
}