package questions;

public class EPAMChallenge {

	static int fan = 10;
	static int bulb = 5;
	static int tv = 15;
	
		
	public static int powerConsumption(int fanSwitch,int bulbSwitch, int tvSwitch)
	{
		int consumption = 0;		
			consumption = fanSwitch*fan+bulbSwitch*bulb+tvSwitch*tv;		
		
		return consumption;
	}
	
	public static void main(String[] args) {
		
		System.out.println(EPAMChallenge.powerConsumption(1, 0, 0));
		
	}
}
