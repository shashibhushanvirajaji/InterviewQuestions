package questions;

public class SameNameSameParametersDiffReturnType {

	
	public static int add(int a, int b)
	{
		return 1;
	}
	
	public static String add(int a, int b)
	{
		return "hello";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(1,3);
	}

}
