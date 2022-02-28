package java8features;

import java.util.Arrays;
import java.util.List;

public class PredicatEx {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,8,9);
		/*
		 * for(Integer number : numbers) { System.out.println(number.intValue()); }
		 */
			
		//numbers.stream().mapToInt(Integer::intValue).filter(num->num%2==0).forEach(System.out::println);
		
		

	}

}
