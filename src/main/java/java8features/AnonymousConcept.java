package java8features;

public class AnonymousConcept  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// anonymous way of implementing interfaces
		IPrintable print = new IPrintable() {
			
//			@Override
//			public void print() {
//				System.out.println(" string from anonymous class ");
//			}

			@Override
			public void print(Object t) {
				// TODO Auto-generated method stub
				
			}
		};
		print.print("bhushan");
		
	}
	
	// conventioal way of implementing interfaces

	/*
	 * @Override public void print() { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
