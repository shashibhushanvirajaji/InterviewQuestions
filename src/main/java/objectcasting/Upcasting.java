package objectcasting;

public class Upcasting {

	public static void main(String[] args) {
		
		/* Superclass superclass = new Subclass();  // upcasting
		superclass.methodFromSuperclass();
		
		Subclass subclass = (Subclass) new Superclass();
		//subclass.
*/
		
		Car car = new BMW();
		
		
		BMW b = (BMW) new Car();
	
	}

}
