package IX.exceptions.assertions;

import java.util.InputMismatchException;
import java.util.Scanner;

class ScanInt2 {
	public static void main(String[] args) {
		System.out.println("Type an integer in the console: ");
		Scanner consoleScanner = new Scanner(System.in);
		try {
			System.out.println("You typed the integer value: " + consoleScanner.nextInt());
		} catch (InputMismatchException ime) {
			System.out.println("Error: You typed some text that is not an integer value...");
			ime.printStackTrace(); //"Estoura" a stack trace
			for(StackTraceElement methodCall : ime.getStackTrace())
				System.out.println(methodCall); //Printa a stack trace
		}
	}
}
