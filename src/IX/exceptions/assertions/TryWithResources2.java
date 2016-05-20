package IX.exceptions.assertions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.zip.ZipOutputStream;

class TryWithResources2 {
	public static void main(String[] args) {
		System.out.println("Type an integer in the console: ");
		try (Scanner consoleScanner = new Scanner(System.in)) {//Tem que declarar a variável dentro do () do try
			System.out.println("You typed the integer value: " + consoleScanner.nextInt());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("aaaaa");
		}
		//I can have a try-with without catch because it is translated to a try/finally block
		//To be usable with a try-with-resources statement, the class of that resource must implement the java.lang.AutoCloseable interface.
			//This interface declares one single method named close().
		
		
		//Example of use more than one resource inside try-with
		//If I don't have catch and I have a checked exception so code will not compile
		//Separate resources declaration using ;
		try (ZipOutputStream zipFile = new ZipOutputStream(new FileOutputStream("try.zip"));
			FileInputStream fileIn = new FileInputStream("try.txt"); Scanner consoleScanner = new Scanner(System.in)) {
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}