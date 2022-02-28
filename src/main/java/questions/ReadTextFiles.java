package questions;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTextFiles {

	public static void main(String[] args) {

		FileInputStream file = null;
		BufferedInputStream bis = null;
		try {
			file = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\main\\java\\questions\\Text1.txt"));
			bis = new BufferedInputStream(file);
			
				while(bis.available()>0)
					System.out.print((char)bis.read());
		
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		String str = "java";
//		String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
//		System.out.println(cap);

//		Scanner sc = new Scanner(System.in);
//		String A = sc.next();
//		String B = sc.next();
//		
//		System.out.println(A.length()+B.length());
//		
//		if(A.compareTo(B)>0)
//			System.out.println("Yes");
//		else
//			System.out.println("No");
//		
//		System.out.println(A.substring(0, 1).toUpperCase()+""+A.substring(1)+ " "+ B.substring(0, 1).toUpperCase()+""+B.substring(1) );
		
//		Scanner in = new Scanner(System.in);
//      String S = in.next();
//      int start = in.nextInt();
//      int end = in.nextInt();
//      System.out.println(S.substring(start, end-1));
	}
}
