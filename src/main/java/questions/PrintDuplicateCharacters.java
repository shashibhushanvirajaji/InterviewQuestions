package questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PrintDuplicateCharacters {

	
	public static void main(String[] args) {
		


		printDuplicateChars(" ");
		printDuplicateChars("");
		printDuplicateChars("shashi");
				
	}
	
	public static void printDuplicateChars(String str)
	{

		
		if(str == null)
		{
			System.out.println("null value");
			return;
		}
		
		if(str.isEmpty())
		{
			System.out.println("Empty String passed");
			return;
		}
		
		if(str.isBlank())
		{
			System.out.println("String is blank");
			return;
		}
		
		char[] chArray = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap();
		for(Character ch : chArray)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Entry<Character, Integer> entry : entrySet)
		{
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey()+" repeated "+entry.getValue());
			}
		}
		
				
		
		
		
	}

}
