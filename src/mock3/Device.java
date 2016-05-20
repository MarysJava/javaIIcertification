package mock3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class Device implements AutoCloseable {
	String header = null;

	public void open() throws IOException {
		header = "OPENED";
		System.out.println("Device Opened");
		throw new IOException("Unknown");
	}

	public String read() throws IOException {
		return "";
	}

	public void close() {
		System.out.println("Closing device"); //Passa primeiro no close depois do catch/finally
		header = null;
		throw new RuntimeException("rte");
	}

	public static void main(String[] args) throws Exception {
		try (Device d = new Device()) {
			d.open();
			d.read();
			//d.writeHeader("TEST");
			d.close();
			//throw new Exception("test");
		} 
		catch (Exception e) {
			System.out.println("Got Exception");
//			for(Throwable t : e.getSuppressed()) {
//				System.out.println(t);
//			}
//			e.printStackTrace();
//			int i=0;
//			assert (i >= 0) : "impossible: i is negative!";
//			assert (i >= 0);
			//e.printStackTrace();
			
			//throw new FileNotFoundException("test");
		} finally {
			System.out.println("Finally");
//			for(Throwable t : e.getSuppressed()) {
			//throw new NoSuchFileException("test");
		}
	}
}