package questions;


class AA
{
	static int x = 20;
}

class BBB extends AA
{
	BBB()
	{
		method(x);
	}

	private void method(int x) {
		System.out.println(x);
		
	}
}

class C extends AA
{
	C()
	{
		method(x);
	}

	private void method(int x) {
		// TODO Auto-generated method stub
		
	}
}
public class WoringWithStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BBB b = new BBB();
	}

}
