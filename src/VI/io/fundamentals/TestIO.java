package VI.io.fundamentals;

import java.io.Console;

public class TestIO {

	public static void main(String []args) {
		// get the System console object
		Console console = System.console();
		if(console == null) {
			System.err.println("Cannot retrive console object - are you running your application from an IDE? Exiting the application ... ");
			System.exit(-1); // terminate the application
		}
		// read a line and print it through printf
		console.printf(console.readLine());
		}
	
	/* IMPORTANT
	 * 
	 *  Reader reader() Returns the Reader object associated with this Console object;
can perform read operations through this returned reference.

PrintWriter writer() Returns the PrintReader object associated with this Console
object; can perform write operations through this returned
reference.

String readLine() Reads a line of text String (and this returned string object does
not include any line termination characters); returns null if it
fails (e.g., the user pressed Ctrl+Z or Ctrl+D in the console)

String readLine(String fmt, Object... args) Same as the readLine() method, but it first prints the string fmt.

char[] readPassword() Reads a password text and returns as a char array; echoing is
disabled with this method, so nothing will be displayed in the
console when the password is typed by the user.

char[] readPassword(String fmt,
Object... args)
Same as the readPassword() method, but it first prints the
string given as the format string argument before reading the
password string.

Console format(String fmt, Object... args) Writes the formatted string (created based on values of fmt
string and the args passed) to the console.

Console printf(String fmt, Object... args) Writes the formatted string (created based on values of fmt
string and the args passed) to the console. This printf method
is the same as the format method: This is a “convenience
method”—the method printf and the format specifiers
are familiar to most C/C++ programmers, so this method is
provided in addition to the format method.

void flush() Flushes any of the data still remaining to be printed in the
console object’s buffer.
	 * 
	 */

}
