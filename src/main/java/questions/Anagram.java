package questions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "teg";
		String s2 = "get";
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);System.out.println(ch1);
		Arrays.sort(ch2);System.out.println(ch2);
		
		if(ch1.length != ch2.length)
		{
			System.out.println("not ok");
		}
		else
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("good");
		}

	}

}
