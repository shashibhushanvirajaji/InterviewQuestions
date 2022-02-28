package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatElements {

	public static void main(String[] args) {
		
		String companies[] = {"hp","cg","amazon","sg","lenovo","cgi","cg"};
		List com= Arrays.asList(companies);
		
		
		// removes the duplicate values 
		Set<String> removeduplication = new HashSet<String>(com);
		for(String rr : removeduplication)
			System.out.println(rr);
		
		// finds the duplicated values
		Set<String> duplicate = new HashSet<String>();
		for(String comm : companies)
		{
			if(duplicate.add(comm)==false)
				System.out.println(comm);
		}
		


	}

}
