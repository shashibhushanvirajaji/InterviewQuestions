package questions;


class student
{
	String name;
	int rollnumber;
	
	
}
public class Stringgs {

	public static void main(String[] args) {
	
	
	StringBuffer sb = new StringBuffer();
	for(int i=0;i<25000;i++)
		sb.append(i);
	System.out.println("for string buffer: "+System.currentTimeMillis());
	
	StringBuilder sbb = new StringBuilder();
	for(int i=0;i<25000;i++)
		sbb.append(i);
	System.out.println("for string builder: "+System.currentTimeMillis());

	
	}

}
