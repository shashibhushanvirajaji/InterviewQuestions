package questions;

import java.util.Collection;

public class SwapNames {

//	public static <T> void Swap(T a, T b) {
//		
//		T p1 = a;
//		T p2 = b;
//		T temp;
//		
//		temp = p1;
//		p1 = p2;
//		p2=temp;
//		
//		System.out.println(p1+" "+p2);
//	}
	
	public static Object Swap(Object o1, Object o2)
	{
		return o2;
		
	}
	
	 
	public static void main(String[] args) {

		String fullname = "Shashi bhushan";
		String[] fullnameArray = fullname.split(" ");		
		Swap(fullnameArray[0],fullnameArray[1]);
		Swap(23,34);
		Swap(35.56,12.50);
	

	}

	
	

}
