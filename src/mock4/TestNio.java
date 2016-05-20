package mock4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestNio {
	public static void main(String[] args) {
		Path myPath = Paths.get("test.txt"); //Igual .\\test.txt
		try {
			BufferedWriter br = Files.newBufferedWriter(myPath, Charset.forName("UTF-8"),
					new OpenOption[] { StandardOpenOption.APPEND, StandardOpenOption.DSYNC });
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
