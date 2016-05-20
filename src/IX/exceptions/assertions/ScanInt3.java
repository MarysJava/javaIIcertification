package IX.exceptions.assertions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class ScanInt3 {
	public static void main(String[] args) {
		String integerStr = "";
		System.out.println("The string to scan integer from it is: " + integerStr);
		Scanner consoleScanner = new Scanner(integerStr);
		try {
			System.out.println("The integer value scanned from string is: " + consoleScanner.nextInt());
		} catch (InputMismatchException ime) {
			System.out.println("Error: Cannot scan an integer from the given string");
		} catch (NoSuchElementException nsee) {
			System.out.println("Error: Cannot scan an integer from the given string");
		} catch (IllegalStateException ise) {
			System.out.println("Error: nextInt() called on a closed Scanner object");
		}
	}
}