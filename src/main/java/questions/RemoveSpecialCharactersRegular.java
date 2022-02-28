package questions;

import java.util.Arrays;

public class RemoveSpecialCharactersRegular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Y^%^*%&*^*(&234324*(Automation";
		System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
		
		System.out.println(str.replaceAll("[^A-Za-z]", ""));
		
		String st1 = "automation";
		System.out.println(st1.replaceAll("[^aeiou]", "#"));
		
		
	}

}
