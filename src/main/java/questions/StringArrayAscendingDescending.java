package questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StringArrayAscendingDescending {

	
	public static void main(String[] args) {
	
//		String arr[] = {"delhi","pune","hyderabad","koltata","chennai","bangalore" };
//		Arrays.sort(arr);
//		Arrays.stream(arr).sorted().forEach(s->System.out.println(s));
//		
//		Arrays.stream(arr).sorted(Collections.reverseOrder()).forEach(e -> System.out.println(e));;
//		
		
		int arrr[] = {5,15,25,20,26};
		Arrays.sort(arrr);
		System.out.println(arrr[arrr.length-2]);
	}

}
