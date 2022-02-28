package questions;

import org.apache.commons.lang3.StringUtils;

public class ConvertChartoUpperCase {

	public static void main(String[] args) {
		
		String str = "automation";		
		//System.out.println(StringUtils.capitalize(str));
		
		char[] chrs = str.toCharArray();
		for(int i=0;i<chrs.length;i++)
		{
			if(i%2!=0)			
				System.out.print(Character.toString(chrs[i]).toUpperCase());			
			else			
				System.out.print(chrs[i]);			
			
		}
	}

}
