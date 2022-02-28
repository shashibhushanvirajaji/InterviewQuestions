package questions;


class a
{
	static void method2() {}
	
	
}
class b extends a
{
	void method2() {
		
	}
}


class parent
{
	static int i;
	
	void method1() {
		i=23;
	}
	
	static void method()
	{
		 i=23;
		System.out.println("from parent class");
	}
	 
	 static void method(String a)
		{	 
		 
			System.out.println("from parent class");
		}
	 
}
class child extends parent
{
	 void method() {
		System.out.println("from child");
	}
}

public class Staticoverridding {

	public static void main(String[] args) {

		child c  = new child();
		c.method();
	}

}
