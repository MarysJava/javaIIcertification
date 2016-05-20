package VI.io.fundamentals;

import java.io.Console;
import java.util.Arrays;

public class TestIO1 {
	
	public static void main(String []args) {
	
		Console console = System.console();
		if(console != null) {
			String userName = null;
			char[] password = null;
			userName = console.readLine("%s %f.1", "Enter your username: ", 0.255f);
			// typed characters for password will not be displayed in the screen
			password = console.readPassword("Enter password: ");
			// password is a char[]: convert it to a String first before comparing contents
		
			if(userName.equals("scrat") && new String(password).equals("nuts")) {
				// we're hardcoding username and password here for
				// illustration, don't do such hardcoding in pratice!
				console.printf("login successful!");
			}
			else {
			Console c = console.printf("restart application and try again");
			}
			// "empty" the password since its use is over
			Arrays.fill(password, ' ');
		}
	}
}
