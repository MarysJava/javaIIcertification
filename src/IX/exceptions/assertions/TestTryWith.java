package IX.exceptions.assertions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.ZipOutputStream;

public class TestTryWith {
	public static void main(String[] args) {
		try  {
			test();
		} catch (Exception e) {
			System.out.println("Main: "+e);
		}
	}
	
	public static void test() throws Exception {
		try (ZipOutputStream zipFile = new ZipOutputStream(new FileOutputStream("try111.zip"));
				FileInputStream fileIn = new FileInputStream("try12.txt"); Scanner consoleScanner = new Scanner(System.in)) {
		} finally {
			//throw new IOException();
		}
	}
}
