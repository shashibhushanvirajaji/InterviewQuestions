package hackerrankquestions;

import java.util.Scanner;

public class InputOutpout {

	public static void main(String[] args) {
		
//		 Scanner scan = new Scanner(System.in);	
//	     int i = scan.nextInt();
//	    String str = String.format("%03d", i);
//	    System.out.println(str);
	    
	    Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-14s %03d\n", s1, x);
        }
        System.out.println("================================");

	}
}
