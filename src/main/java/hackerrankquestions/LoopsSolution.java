package hackerrankquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsSolution {

	public static void main(String[] args) {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
			int N = Integer.parseInt(bufferedReader.readLine().trim());
			int symbol = 120;
			char ch = (char)symbol;
			if(N>=2 && N<=20)
			{
				for(int index=1;index<=10;index++)
				{
					System.out.println(N+" "+ch+" "+index+" = "+(N*index));
				}
			}
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        try {
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
