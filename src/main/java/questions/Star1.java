package questions;

/*
 
*
**
***
****
*****
****** 
 
 
 */
public class Star1 {

	public static void main(String[] args) {
	
		/*
		 * for(int r=1;r<7;r++) { for(int c=1;c<=r;c++) { System.out.print("* "); }
		 * System.out.println(); } for(int r=1;r<=5;r++) {
		 * 
		 * for(int s=6;s>r;s--) { System.out.print("* "); } System.out.println(); }
		 */
		 		
	
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)			
				System.out.print(" ");
			
			for(int k=1;k<=i;k++)
				System.out.print("*");
			
			System.out.println();
		}

	}

}
