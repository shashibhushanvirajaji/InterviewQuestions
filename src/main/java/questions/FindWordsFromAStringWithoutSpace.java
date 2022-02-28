package questions;

import java.util.stream.IntStream;

public class FindWordsFromAStringWithoutSpace {

	public static void main(String[] args) {
		String str = "Shashi Bhushan Virajaji Reddy";
		char[] chrs = str.toCharArray();
		int count=0;		
		for(char ch : chrs) {
			if(ch>=65 && ch<=91 )
				count++;
		}
		// printing how many upper case letters are there 
		System.out.println(count);
		
		 
	}

}
