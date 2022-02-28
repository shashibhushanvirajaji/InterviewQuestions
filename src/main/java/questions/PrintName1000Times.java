package questions;

public class PrintName1000Times {

	public static void main(String[] args) {

		
		for(int number=2; number<=1000;number++)
		{
			boolean flag = true;
			for(int i=2;i<number-1;i++)
			{
				if(number%i==0)
				{
					flag = false;
					break;
				}				
		
			}
			if(flag==true)
				System.out.println(number + " is prime");
		}

	}

}
