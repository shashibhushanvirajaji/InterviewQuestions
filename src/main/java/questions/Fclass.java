package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

class classA
{
	private classA() {
		
	}
}

class subclass extends classA
{
	
}

public class Fclass
{	
	
	public static void main(String[] args) {
	
		subclass sc = new subclass();
		
		String arr[] = {"india","srilanka","usa"};
		List<String> ltos = new ArrayList<String>(); 
				
				Arrays.asList(arr);
		System.out.println(ltos);
	
//		List<String> ll = Arrays.asList("tamil","telugu","hindi","punjab","karnataka","kerala");
//		new TreeSet<String>(ll)
//		.forEach(e->System.out.println(e));;
	}
}