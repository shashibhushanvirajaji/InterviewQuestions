package questions;

import java.util.Arrays;

public class FindUpperandLower {

	public static void main(String[] args) {
		
		String name = "ShashiBhushan";
		char chrArray[] = name.toCharArray();		
		int noOfUpperCharacters = 0;
		int noOfLowerCharacters = 0;
		for(char chr : chrArray)
		{
			if(!Character.isLowerCase(chr))
				noOfUpperCharacters++;
			else
				noOfLowerCharacters++;			
			
		}
		System.out.println(noOfUpperCharacters);
		System.out.println(noOfLowerCharacters);

	}

}
