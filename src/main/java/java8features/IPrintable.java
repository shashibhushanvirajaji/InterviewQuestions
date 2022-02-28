package java8features;

@FunctionalInterface
public interface IPrintable<T> {

	void print(T t);
	
	default void print1()
	{
		System.out.println("heelow");
	}
	
	static void print2() {
		System.out.println(" from print 2");
	}

	
}
