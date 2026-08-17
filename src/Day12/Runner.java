package Day12;
import java.util.*;

public class Runner {
	
	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("HP", 16, 70000));
		laps.add(new Laptop("Apple", 8, 85000));
		laps.add(new Laptop("Lenovo", 8, 79000));

//		Comparator<Laptop> com = new Comparator<Laptop>() {
//			
//			public int compare(Laptop l1, Laptop l2) 
//			{
//				if(l1.getPrice() > l2.getPrice())
//					return 1;
//				else
//					return -1;
//			}
//				};
				
//		Collections.sort(laps, com);
		
		Collections.sort(laps);
		
		for(Laptop l : laps) {
			System.out.println(l);
		}
	}

}
