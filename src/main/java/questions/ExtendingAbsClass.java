package questions;

public class ExtendingAbsClass extends AbsClass {

	private static int b =12;
	public ExtendingAbsClass(int b) {
		super(b);
		
	}

	public static void main(String[] args) {
		ExtendingAbsClass ebc = new ExtendingAbsClass(b);
	}
}
