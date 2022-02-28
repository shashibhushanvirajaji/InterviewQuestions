package questions;

import java.util.Arrays;
import java.util.List;

public class StringOccurenceBreadSlices {

	public static void main(String[] args) {

		int count = 0;
		String str = "jambreadjambreadbreadjamjambreadjamjambread";
		int val = str.indexOf("bread");
		while(val != -1)
		{
			count++;			
			val = str.indexOf("bread", val+1);
			
		}
		System.out.println("no of bread slices = " + count);
		
		
		int number = 128322251;
		String strr = Integer.toString(number);
		System.out.println(strr.indexOf('2'));
		
		
		
		//List<String> str1 = Arrays.asList(str);
		//System.out.println(str1.stream().filter(str1->str1.contains("bread")).count());
		
//		String strtosearch = "abc";
//		int index = str.indexOf(strtosearch);
//		while (index >= 0) {
//			count++;
//			int beginIndex = index + strtosearch.length();
//			str = str.substring(beginIndex, str.length());
//			index = str.indexOf(strtosearch);
//		}
//
//		System.out.println("no of bread slices = " + count);
	}

}
