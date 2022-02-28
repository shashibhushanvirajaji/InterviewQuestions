package questions;

import java.util.Stack;

public class StackChars {

	public static void main(String[] args) {
		
		Stack<Character> chars = new Stack<Character>();
		String str = "ABCD==F=EG=";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==(char)('='))
			{
				chars.pop();
			}
			else 
			chars.push(str.charAt(i));
		}
		System.out.println(chars);
				
	}
}
