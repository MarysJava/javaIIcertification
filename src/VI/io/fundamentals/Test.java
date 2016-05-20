package VI.io.fundamentals;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test {
	
	/*
	 * I can user a Reader to read using "byte input classes" like this, but, if the input file is data (bytes) it will print strange characters
	 * because readers only read text streams.
	 * 
	 */

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileInputStream findings = new FileInputStream("test.txt");
			DataInputStream dataStream = new DataInputStream(findings);
			br = new BufferedReader(new InputStreamReader(dataStream));
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close(); //Close all underlying stream objects because one depends to another
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
		}
	}

}
