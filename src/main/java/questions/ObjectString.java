package questions;


public class ObjectString {

	static void method(String s) {
		System.out.println("String method");
	}

	static void method(Object s) {
		System.out.println("Object method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(null);
	}

}
