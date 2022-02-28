package questions;

import java.util.StringJoiner;

public class StringJoinerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner joiner = new StringJoiner(",","[","]");
		joiner.add("shashi")
		.add("bhushan").add("virajaji");
		
		System.out.println(joiner.toString());
		
		
		
		

	}

}
