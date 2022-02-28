package java8features;

import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		
		Supplier<Double> supplier = ()->  { return Math.random(); };
		Supplier<String> supplier1 = ()->  { return "hello"; };
		System.out.println(supplier.get());
		
		
	}
	
}
