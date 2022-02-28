package questions;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalInt;
import java.util.TreeSet;
import java.util.stream.Collectors;

	
	
public class GetHighestLowestNumber {

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	 List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 56, 7, 89, 10);
		int[] arr = {10, 2, 3, 4, 56, 7, 89, 10};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		
		
//		List<Integer> arr1 =Arrays.stream(arr).boxed().collect(Collectors.toList());
//		
//		new TreeSet<Integer>(arr1).descendingSet().forEach(System.out::println); // display array in descending order
//
//		// display array in ascending order.
//		new TreeSet<Integer>(arr1).forEach(System.out::println);
//		
//	//int max = arr1.stream().mapToInt(v -> v ).max().orElseThrow(NoSuchElementException::new);
////		int min = arr1.stream().mapToInt(v -> v ).min().orElseThrow(NoSuchElementException::new);
////		System.out.println(max);
////		System.out.println(min);
//	
//	OptionalInt intt = arr1.stream().mapToInt(v -> v ).max();
//	System.out.println(intt.toString());
		
		
	}
	
	

}
