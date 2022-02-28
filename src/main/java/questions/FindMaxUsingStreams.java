package questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxUsingStreams {

	public static void main(String[] args) {
		
		List<Integer> numbers =  Arrays.asList(12,3,4,56,76,32,56);
	
		numbers.stream()
		.mapToInt( number->number).boxed().sorted().forEach(e->System.out.println(e));
		//.sequential().forEach(e->System.out.println(e));
		
		numbers.stream()
		.mapToInt( number->number).boxed().sorted(Comparator.reverseOrder())
		.forEach(e->System.out.println(e));
		
//		.max().getAsInt();
	//	System.out.println(max);

	}

}
