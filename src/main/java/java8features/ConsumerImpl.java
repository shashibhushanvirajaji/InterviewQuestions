package java8features;

import java.util.Arrays;
import java.util.List;

public class ConsumerImpl {

	public static void main(String[] args) {
		
		List<String> places = Arrays.asList("delhi","punjab","karnataka","bangalore","chennai","goa","chandi");
		places.forEach(place -> { 
			System.out.println(place.toUpperCase());		
		});
	}
}
