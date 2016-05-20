package IX.exceptions.assertions;

import java.io.FileNotFoundException;

public class BaseClass {
	
//	{
//		FileInputStream fileIn = new FileInputStream("test");
//		// I cannot throw an explicit exception/error here, compile error
//	}
//	
	public BaseClass() { } //throws IOException { } //I can use throws in a constructor! 
	// And if I have a non-static initialization block that can throw a checked exception like this above, I MUST use or code will not compile

	public void test() throws FileNotFoundException {
		
	}
}
