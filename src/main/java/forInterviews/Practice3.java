package forInterviews;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Practice3 {

	public static void main(String[] args) {
		
		
		String str = "aaabbc";
		char[] chrs = str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c : chrs)
		{
			if(!map.containsKey(c))
			{
				map.put(c, 1);				
			}
			else
			{
				map.put(c, map.get(c)+1);
			}
		}
		
		
		map.forEach(new BiConsumer<Character, Integer>() {
			public void accept(Character k, Integer v) {
				System.out.print(k+""+v);
			}
		});;
	}
	
	
}
