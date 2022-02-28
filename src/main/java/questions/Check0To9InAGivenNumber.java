package questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Check0To9InAGivenNumber {

	public static void main(String[] args) {
		
		String  phonenunber = "984475336380";
		int i=0;
		int val;
		while(i<=9)			
		{
			String number = String.valueOf(i);
			val = phonenunber.indexOf(number);
			i++;
			if(val == -1)
				System.out.println(number+ " number is missing");
		}
		
//		
//		char[] chars = phonenunber.toCharArray();
//		for(char ch : chars)
//		{
//			for(int i =1;i<=9;i++)
//			{
//				
//			}
//		}		
		
		
		
		
		
		
		
		
	//	String str = "463210";
		/*
		 * String str = "582413067"; Map<Character, Boolean> map = new HashMap<>();
		 * boolean exist = false; for(int index=0;index<10;index++) { char ch = (char)
		 * ((char)index+'0'); // System.out.println("character = "+ch);
		 * if(str.indexOf(ch)>0) map.put(ch, true); if(str.indexOf(ch)<0) map.put(ch,
		 * false); }
		 * 
		 * Collection<Boolean> valuess = map.values(); List<Boolean> val = new
		 * ArrayList<>(valuess); int count =0; for(int i =0;i<val.size();i++) {
		 * if(val.get(i)==false) count++; }
		 * 
		 * if(count>1) { System.out.println("false"); } else {
		 * System.out.println("true"); }
		 * 
		 */
		
		 			
		}
	
}
	