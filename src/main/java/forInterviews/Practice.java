package forInterviews;

import java.util.ArrayList;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
	
	/*	Write a method to give response of all pairs of prime numbers that is equivalent to a given number. 
		Ex. 14 as input should give output as 3+11, 7+7, etc.  */
//		
//		int primes[] = {3,5,7,11};
//		
//		
//		for(int index=0;index<primes.length;index++)
//		{
//			for(int index1=0;index1<primes.length;index1++)
//			{
//				int sum = primes[index]+primes[index1];
//				
//				if(sum==14)
//				{
//					System.out.println(primes[index]+"+"+primes[index1]);
//				}
//			}
//		}
//		
		System.out.println(returnPrimes(40));
		
	}	
	
	  public static List<Integer> returnPrimes(int number) {
		  List<Integer> primeNumbers = new ArrayList<Integer>();
		  int limit=number/2;
		  
		  for(int numbers=2;numbers<=number;numbers++)
			
			  for(int index=2;index<=limit;index++) {
				  if(numbers%index!=0)
				  {
					primeNumbers.add(numbers);    
				  }
	  }
		  return primeNumbers;
		  }
	 
	
}
