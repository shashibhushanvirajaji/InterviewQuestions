package questions;

import java.io.IOException;

public class KillingProcesses {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		try {
			Process proc = runtime.exec("chromedriver.exe");
			proc.destroy();
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}
