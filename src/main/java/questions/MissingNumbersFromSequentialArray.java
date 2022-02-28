package questions;

public class MissingNumbersFromSequentialArray {

	public static void main(String[] args) {
		
		int[] arr = {0,0,0,0,50};
		int len = arr.length;
		System.out.println(len);
		int number;
		int num = 0;
		int index =0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				index = i+1;
				number = arr[i];				
				num=number/10;				
			}
		}
		System.out.println(num);
		System.out.println(index);

	}

}
