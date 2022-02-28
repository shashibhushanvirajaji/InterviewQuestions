package questions;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String str)
	{
		super();
	}
	
}

public class TestCustomExc {

	static void validate(int age) throws InvalidAgeException  {
		if (age < 18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("welcome to vote");
	}
	
	public static void main(String[] args) {
	
		try {
			validate(11);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
