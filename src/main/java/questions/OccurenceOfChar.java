package questions;

import java.util.function.IntPredicate;

public class OccurenceOfChar {

//	int a;
//	static void hello()
//	{
//		a=0;
//	}
	
	static int b = 123;
	
	void hello1()
	{
		b =23;
	}
	public static void main(String[] args) {
	
		String str = " i live in hyderabad city";
		/*
		 * char occ = 'a'; int count = 0; for(char ch : str.toCharArray()) { if(ch
		 * ==occ) { count++; } } System.out.println(occ+" => "+count);
		 */
		
		long cCount = str.chars().filter(e->(char)e=='i').count();
		System.out.println(cCount);
		
	}

}
