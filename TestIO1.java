import java.io.Console;
import java.util.Arrays;

public class TestIO1 {
	
	public static void main(String []args) {
	
		Console console = System.console();
		if(console != null) {
			String userName = null;
			char[] password = null;
			userName = console.readLine("%s ", "Enter your username: ");
			// typed characters for password will not be displayed in the screen
			password = console.readPassword("Enter password: ");
			// password is a char[]: convert it to a String first before comparing contents
		
			if(userName.equals("scrat") && new String(password).equals("nuts")) {
				// we're hardcoding username and password here for
				// illustration, don't do such hardcoding in pratice!
				console.printf("login successful!");
			}
			else {
				Console c = console.printf("%s %2d", "restart application and try again", 10);
				System.out.printf(" ", c); //Sempre tem que passar 2 argumentos e se não colocar os especificadores não vai imprimir nada
			}
			// "empty" the password since its use is over
			Arrays.fill(password, ' ');
			
			
			// string has three Scandinavian characters
			//String scandString = "å, ä, and ö";
			// try printing scandinavian characters directly with println
			//System.out.println("Printing scands directly with println: " + scandString);
			// now, get the Console object and print scand characters thro' that
			//console.printf("Printing scands thro' console's printf method: " + scandString);
		}
	}
}
