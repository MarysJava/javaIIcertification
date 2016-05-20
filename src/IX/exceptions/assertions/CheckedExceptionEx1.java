package IX.exceptions.assertions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionEx1 {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(args[0]);
	}
}