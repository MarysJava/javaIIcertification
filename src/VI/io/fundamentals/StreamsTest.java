package VI.io.fundamentals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class StreamsTest {

	// Streams are ordered sequences of data.
	// Java differentiates between processing text and binary data.

	/*
	 * Classes
	 * 
	 * StringReader A character stream that operates on strings.
	 * InputStreamReader This class is a bridge between character streams and
	 * byte streams. FileReader Derived class of InputStreamReader that provides
	 * support for reading character files. PipedReader The PipedReader and
	 * PipedWriter classes form a pair for “piped” reading/writing of
	 * characters. FilterReader Abstract base class for streams that support a
	 * filtering operation applied on data as characters are read from the
	 * stream. PushbackReader Derived class of FilterReader that allows read
	 * characters to be pushed back into the stream. BufferedReader Adds
	 * buffering to the underlying character stream so that there is no need to
	 * access the underlying file system for each read and write operation.
	 * LineNumberReader Derived class of BufferedReader that keeps track of line
	 * numbers as the characters are read from the underlying character stream.
	 * 
	 * StringWriter A character stream that collects the output in a string
	 * buffer, which can be used for creating a string. OutputStreamWriter This
	 * class is a bridge between character streams and byte streams. FileWriter
	 * Derived class of InputStreamWriter that provides support for writing
	 * character files. PipedWriter The PipedReader and PipedWriter classes form
	 * a pair for “piped” reading/writing of characters in character stream.
	 * FilterWriter Abstract base class for streams that supports a filtering
	 * operation applied on data as characters when writing them to a character
	 * stream. PrintWriter Supports formatted printing of characters to the
	 * output character stream. BufferedWriter Adds buffering to the underlying
	 * character stream so that there is no need to access the underlying file
	 * system for each read and write operation.
	 * 
	 */

	public static void main(String []files) {
		if (files.length == 0) {
			System.err.println("pass the name of the file(s) as argument");
			System.exit(-1);
		}
		// process each file passed as argument
		for (String file : files) {
			// try opening the file with FileReader
			try (Reader inputFile = new FileReader(file)) {
				int ch = 0;
				// while there are characters to fetch, read, and print the
				// characters when EOF is reached, read() will return −1,
				// terminating the loop
				while ((ch = inputFile.read()) != -1) {
					// ch is of type int - convert it back to char
					// before printing
					System.out.print((char) ch);
				}
			} catch (FileNotFoundException fnfe) {
				// the passed file is not found ...
				System.err.printf("Cannot open the given file %s ", file);
			} catch (IOException ioe) {
				// some IO error occurred when reading the file ...
				System.err.printf("Error when processing file %s... skipping it", file);
			}
			// try-with-resources will automatically release FileReader object
		}
	}
}
