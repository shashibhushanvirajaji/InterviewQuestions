package forInterviews;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Practice2 {

	public static void main(String[] args) {
		
		//Integer Array contains duplicate value- {5,10,5,15,10,5,15,5,10}
		//Find the occurrence of each element.
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>(); 
		
		int[] array = {5,10,5,15,10,5,15,5,10};
		
		for(int i=0;i<array.length;i++)
		{
			int value = array[i];
			
			if(!map.containsKey(value))
			{
				map.put(value, 1);
			}
			else
			{
				map.put(value, map.get(value)+1);
			}
			
			
		}
		map.forEach(new BiConsumer<Integer, Integer>() {
			public void accept(Integer k, Integer v) {
				System.out.println(k+"-"+v);
			}
		});
		
		
			
	}
}
