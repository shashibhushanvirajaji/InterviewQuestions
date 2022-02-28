package questions;

public class FindMissing {

	public static void main(String[] args) {
		
		int sum=0;
		int acsum=0;
		
		for(int i=1;i<=10;i++)
			acsum = acsum+i;
			
		int arr[] = {1,3,4,5,6,8,9,10};
		for(int i=0;i<arr.length;i++)
			sum= sum+arr[i];
		
		System.out.println(acsum-sum);

	}

}
