package Day9;

import java.util.*;

public class HashTree {
	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();
		
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");
        
        System.out.println(fruits);

        System.out.println(fruits.contains("Mango"));

        fruits.remove("Orange");

        System.out.println(fruits);
        
	}

}
