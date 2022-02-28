package questions;

public class contunue {

	public static void main(String[] args) {
		
//		for(int i=0;i<2;i++)
//			continue;
		
		String str = "874851247";
				 int temp=0;
				  char c[]= str.toCharArray();
				   for(int i =1; i<=9; i++)  
				   {
				    temp=i;
				    for(int j=0; j< c.length; j++)
				     {
				      if(c[j] == temp)
				       {
				        continue;
				       }
				       else
				        System.out.println("Missing number is" + c[j]);
				}
				   }
				   }
}
