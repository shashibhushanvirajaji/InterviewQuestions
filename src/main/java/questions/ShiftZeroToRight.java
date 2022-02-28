package questions;

public class ShiftZeroToRight {

	public static void main(String[] args) {
		
		int a[]= {0,1,4,6,0,0,5};
		int[] temp;
		temp = new int[a.length];		
		
		int index = 0;
		for(int aa: a)
		{
			if(aa!=0)
			{
				temp[index]=aa;	
				index++;
			}
		}
		
		
		for(int t1 : temp)
			System.out.print(t1+" ");
		
		
		
					
		

	}

}
