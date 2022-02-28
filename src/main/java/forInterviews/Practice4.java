package forInterviews;

public class Practice4 {

	public static void main(String[] args) {
		
		System.out.println(checkPhonenumber("0845336380"));
	}
	
	static boolean checkPhonenumber(String phNumber)
	{
		
		
		
		boolean flag = true;
		if(phNumber.length()==10)
		{
			char ch = phNumber.charAt(0);
			if(ch!='0')
			{			
				for(int i=0;i<phNumber.length();i++) {
						if(!Character.isDigit(phNumber.charAt(i)))
						{
							flag = false;
							break;
						}
				}
			}
			else
			{
				flag = false;
			}
			
		}
		else
		{
			flag = false;
		}
		
		return flag;
	}
}
