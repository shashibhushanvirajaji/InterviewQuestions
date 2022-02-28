package questions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileusingFileReader {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		BufferedReader br= null;
		try {
			br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\questions\\Text1.txt"));
			String line = br.readLine();
			while(line != null)
			{
				System.out.println(line);
				
				char[] chars = line.toCharArray();
				int lettersCount = 0;
				int spaceCount = 0;
				for(char ch : chars)
				{
					
					if(Character.isLetter(ch))
						lettersCount++;
					
					if(Character.isSpace(ch))
						spaceCount++;
				}
				System.out.println(lettersCount);
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
}
