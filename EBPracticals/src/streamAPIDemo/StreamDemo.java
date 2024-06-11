package streamAPIDemo;

import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> admnos = List.of(3,5,2,7,1,8); 
		
					admnos.stream()
		                  .sorted()
						  .forEach(n -> System.out.println(n));
			
		System.out.println(admnos); // Stream API doesn't change the sequence or change the values in the list.
	}
}
