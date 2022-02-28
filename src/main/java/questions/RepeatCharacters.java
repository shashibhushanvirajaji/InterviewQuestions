package questions;

public class RepeatCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 12345;
		System.out.println();
		String n = "shashibhushan"; //String.valueOf(a);
		
		char chs[] = n.toCharArray();
		int pos;
		int strLen = n.length();
		
		for(int i = 0;i<strLen;i++) // rows
		{
			pos = strLen - 1 -i;
			for(int j=0;j<strLen ; j++)
			{
				System.out.print(n.charAt(pos));
				pos++;
				if(pos== strLen)
				 pos = 0;
				
			}
			System.out.println();
		}
		
		

	}

}
