package hackerrankquestions;

import java.util.Scanner;

public class LoosII {

	public static void main(String[] args) {
		
	//	System.out.println(Integer.valueOf((int) Math.pow(2, 3)));
		
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a = 0; int b = 0; int n = 0;
        
       for(int i=0;i<t;i++){
              
    		   a = in.nextInt(); //5
               b = in.nextInt(); //3 
               n = in.nextInt(); //5
               
               for(int rows=1;rows<=n;rows++) // rows 
               {
            	   int sum = 0;
            	   for(int nn=0;nn<rows;nn++)
            	   {
            		 sum += Integer.valueOf((int) Math.pow(2, nn))*b;            		 
            	   }
            	   System.out.print(a+sum+" ");            	   
               }
               System.out.println();
              
           }
    	   
    
      
       
        in.close();
	}
}
