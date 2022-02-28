package questions;

import jdk.jfr.internal.Logger;

public class IntegerCaching {

	public static void main(String[] args) {

		Integer a = 200;
		Integer b = 200;
		
		if (a==b)
		{
			System.out.println("both are equal");			
		}
		else
		{
			System.out.println("both are not equal");
		}

		System.out.println(Integer.valueOf(129));
		
		if(Integer.valueOf(129)==(Integer.valueOf(129))) {
			{
				System.out.println("both are equal");
			}
		
		}
	}

}
