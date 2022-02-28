package questions;

import com.github.javafaker.*;

public class GeneratingFakeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Faker faker = new Faker();
	 System.out.println(faker.name().fullName()+ " " + faker.date().birthday());
	}

}
