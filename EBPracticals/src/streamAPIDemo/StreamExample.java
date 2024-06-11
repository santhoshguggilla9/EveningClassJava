package streamAPIDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		
		//List<Integer> nums = new ArrayList<Integer>();
		
		List<Integer> nums = Arrays.asList(2,6,8,5,9,7);
		
		
//		nums.add(2);
//		nums.add(6);
//		nums.add(8);
//		nums.add(5);
//		nums.add(9);
//		nums.add(7);

		// pick - even || double the even || sort || sum
		
//				List<Integer> result = nums.stream()
//									.filter(n -> n % 2 == 0) //even numbers (2,6,8)
//									.map(n -> n * 2 ) // doubling
//									.sorted()
//									.collect(Collectors.toList());
//				System.out.println(result);
					
					int sum = nums.stream()
						.filter(n -> n % 2 == 0) //even numbers (2,6,8)
						.map(n -> n * 2 ) // doubling
						.sorted()
						.reduce(0, Integer::sum);
					
					System.out.println(sum);
						

	}
}
