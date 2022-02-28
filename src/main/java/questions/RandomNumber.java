package questions;

public class RandomNumber {

	public static void main(String[] args) {
		
		int randomNumber1;
		int randomNumber2;
		int i= 1;
		while(true) {
			randomNumber1 = 1 + (int)(Math.random() * 6);
			randomNumber2= 1 + (int)(Math.random() * 6);
			System.out.println(randomNumber1+ "  " + randomNumber2);
			 if(randomNumber1==6 & randomNumber2==6)
				 break;			
		}
		 
		 
		
	}

}
