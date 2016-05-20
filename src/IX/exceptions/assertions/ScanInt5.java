package IX.exceptions.assertions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class ScanInt5 {
	public static void main(String[] args) {
		String integerStr = "";
		System.out.println("The string to scan integer from it is: " + integerStr);
		Scanner consoleScanner = new Scanner(integerStr);
		try {
			System.out.println("The integer value scanned from string is: " + consoleScanner.nextInt());
			// You cannot combine the catch clauses of NoSuchElementException
			// and InputMismatchException - classes base e derivadas junto
			// não compila
		} catch (InputMismatchException e) {
			// TODO: handle exception
		} catch (NoSuchElementException | IllegalStateException multie) { // The
																			// order
																			// is
																			// indifferent and can have more than 2 exceptions but not related (base/derived class)
			System.out.println("Error: An error occured while attempting to scan the integer");
		}
	}
}