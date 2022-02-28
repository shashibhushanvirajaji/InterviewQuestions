package questions;

public class Find1Digitnumbers {

	public static void main(String[] args) {
		
		int number=50;
		int count=0;
		for(int i=1;i<=number;i++) {
			
			String str = Integer.toString(i);
			if(str.contains("1"))
			{
				count++;
				System.out.println(str);
			}
			
			
			
		}
		System.out.println(count);
	}

}
