package java8features;

public class LambaImplementaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * IPrintable print = () -> {System.out.println("from lamba ");};
		 * 
		 * print.print(); print.print1(); IPrintable.print2();
		 */
		
		IPrintable<String> obj = (s)->System.out.println(s);
		obj.print("shashi");
	}

}
