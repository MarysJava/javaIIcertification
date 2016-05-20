package IX.exceptions.assertions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ThrowsClause1 {
	// since this method does not handle FileNotFoundException,
	// the method must declare this exception in the throws clause
	public int readIntFromFile() throws FileNotFoundException {
		// If I put a try/catch here and remove the throws clause so main can also remove the throws clause from method signature
		Scanner consoleScanner = new Scanner(new File("integer.txt"));
		return consoleScanner.nextInt();
	}

	// since readIntFromFile() throws FileNotFoundException and main() does not
	// handle
	// it, the main() method declares this exception in its throws cause
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Reading an integer from the file 'integer.txt': ");
		System.out.println("You typed the integer value: " + new ThrowsClause1().readIntFromFile());
	}
}