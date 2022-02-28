package questions;

import java.util.Arrays;

public class ConverStringtoNumber {

	public static void main(String[] args) {
		
		String str = "$12,400";		//12400
		
		String str1 = str.replaceAll("[^0-9]", "");
		System.out.println(str1);
		
//		System.out.println(str.replace("$", "").replace(",", ""));
//		
//		int as = Integer.parseInt(str.replace("$", "").replace(",", ""));
//		System.out.println(as+2343);
//		
		
	}

}
