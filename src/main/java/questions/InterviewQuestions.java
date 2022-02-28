package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class InterviewQuestions {

	static String shashi1;
	
	public static void main(int[] arg)
	{
		
	}
	public static void main(String[] args) {

		
		
		//Acclass ac = new Acclass();
		// printing statement without using semicolon ';'
		if(System.out.printf("Hello world"+"\n") == null)	{			
		}
		
		if(System.out.append("hello world"+"\n")==null)	{			
		}
		
		if(System.out.append("hellow world").equals(null)) {			
		}
		
		// printing numbers  1 to 100 without using numbers 
		
		int one ='A'/'A';
		String s = "..........";
		for (int i=one;i<=(s.length()*s.length());i++)	{
			System.out.println(i);
		}
		
		for(int i=one;i<='d';i+=one)
		{
			System.out.println(i);
		}
		
		// reversing a string without built in method
		
		//StringBuffer sb = new StringBuffer("shashibhushan");
		//System.out.println(sb.reverse());
		
		String ss = "shashibhushan";
		char[] chars = ss.toCharArray();
	    int len = chars.length;
		for(int i = len-1;i>0;i--)
			System.out.print(chars[i]);
		
		System.out.println("index of b "+ss.indexOf('b'));
		
		
		String str = "aaaabbcccddddd";		
		char[] charss = str.toCharArray();
		Map<Character,Integer> cc = new HashMap<Character,Integer>();		
		for(char ch : charss)
		{
			if(cc.containsKey(ch))
			{
				int cnt = cc.get(ch);
			    cc.put(ch, ++cnt);
			}
			else
				cc.put(ch, 1);
		}
		cc.forEach((key,value)-> {System.out.print(key+""+value);});


		
		
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };
		
		Arrays.sort(inputList,String.CASE_INSENSITIVE_ORDER);
		for(String list:inputList)
			System.out.println(list);
		
		// inverting a number : 
		
		int num = 12364;
		String snum = String.valueOf(num);
		System.out.println(new StringBuilder(snum).reverse());
		int rev =0;
		while (num!=0)
		{
			int b= num%10;
			num = num/10;
			rev = rev*10+b;			
		}
		System.out.println(rev);
		
		// checking if an element is present or not ...
		//Boolean isItemPresent = driver.findElements(By.testLocator).size() > 0 //nosuchelementfoundexception
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   /*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(30, SECONDS)
		       .pollingEvery(5, SECONDS)
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		   });  */
		Stream.of(1,2,3,4,5,6,7,8,9).filter(n->n%2==0).forEach(System.out::println);
		/*
		 * String strr = "b3n5h6j7"; //String chh = strr.toCharArray();
		 * Map<String,String> map = new HashMap(); for(int
		 * index=0;index<chh.length;index = index+2) {
		 * 
		 * map.put(chh[index], Integer.parseInt(chh[index+1])); }
		 * System.out.println(map.size());
		 */
		
		String strr = "b3n5h6j7";
		String arr[] = strr.split("^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z])");
		
		Map<Character,Integer> map = new HashMap<>();
		for(int index=0;index<strr.length();index = index+2)					
			map.put(strr.charAt(index), Character.getNumericValue(strr.charAt(index+1)));
		
		map.forEach((key,value)->{ 
			for(int i=0;i<value;i++) {
				System.out.printf("%c",key);
			}
		});
		
		// removing white spaces in a word... String str = "removing white spaces"
		System.out.println();
		String removespaces = "shashi bhushan virajaji reddy";
		
		System.out.println(removespaces.replaceAll("\\s+",""));
		String s1 = "123fadsf";
		System.out.println(s1.startsWith("\\[1-9]"));
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		
		int[] ar1 = {1,2,3,4,2,3};
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		for(int i=0;i<ar1.length;i++)
			arrlist.add(ar1[i]);
		
		// using java 8 streams
		//arrlist.stream().distinct().forEach(e -> {System.out.println(e); });
		
		Set<Integer> arrset = new HashSet<Integer>(arrlist);
		//using arraylist
		//arrset.stream().forEach(e -> {System.out.println(e); });
		
		
		Stream<Integer> sss = Stream.of(12,45,76,34,98,20,30,1,56,16);
		
		
		int numbers[] = {3,4,5,6,7,8,4,3,2};
		Arrays.sort(numbers);
		
		
	//	System.out.println(Object.class.toString());
		
		String name = new String();
		System.out.println("name "+ name);

		int reversingnum = 12364;
			
	}
}
