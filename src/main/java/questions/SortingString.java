package questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.Comparators;

public class SortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> capitals = Arrays.asList("delhi","Delhi","punjab","hyderabad","kolkata");
		String[] aa = {"delhi","Delhi","punjab","hyderabad","kolkata"};
		Arrays.sort(aa, Collections.reverseOrder());
		for(String a : aa)
		{
			System.out.println(a);
		}
//				Collections.reverse(capitals);
//				for(String a : capitals)
//					System.out.print(a+ " ");
	}

}
