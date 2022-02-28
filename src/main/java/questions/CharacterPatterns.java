package questions;

public class CharacterPatterns {

	public static void main(String[] args) {

//		int a=65;
//		for(int i=0;i<=5;i++) {			
//			for(int c=0;c<=i;c++) {								
//				System.out.print( (char)(a+c));
//			}
//			System.out.println();
//		}
		
		// output of the above code
		
		/*
		 * A AB ABC ABCD ABCDE ABCDEF
		 */

		int alphabet = 65;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)alphabet+" ");
			}
			alphabet = alphabet+1;
			System.out.println();
		}
//		
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF


	}

}
