package questions;

class Staticc
{
	static int i=10;
	
	static 
	{
		System.out.println("from staticc class");
	}
}
public class StaticBlocks {

	int a;	
	{
		System.out.println("intialzation block");
		a = 23;
		
	}
	
	static {
		System.out.println("from static block");
	}
	
	public static void main(String[] args) {
	
		System.out.println("from main method");
		System.out.println(Staticc.i);
		
	}
	
	
	
	

}
