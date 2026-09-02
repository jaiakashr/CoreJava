package Day21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
		List<Integer> Numbers = Arrays.asList(10,20,22,30,35,40,48,50);
		
//		Stream<Integer> s1 = Numbers.stream();
//		Stream<Integer> s2 = s1.filter(n -> n%2==0);
//		Stream<Integer> s3 = s2.map(n -> n*2);
//		int result = s3.reduce(0, (c,e) -> c+e);
		
		int result = Numbers.stream()
							.filter(n -> n%2==0)
							.map(n -> n*2)
							.reduce(0,(c,e) -> c+e);
		
		
		System.out.println(result);
//		s3.forEach(n -> System.out.println(n));
		
		
//		Numbers.stream().forEach(n -> System.out.println(n));
		
//		int sum = 0;
//		for(int nums : Numbers) {
//			if(nums%2==0)
//			{
//				nums = nums*2;
//				sum = sum + nums;
//				
//			}
//		}
		
		
//		System.out.println(sum);
	}
}
