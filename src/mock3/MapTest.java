package mock3;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.TreeMap;

public class MapTest {

	
	public static void main(String[] args) {
		TreeMap m = new TreeMap();
		m.put("a", "a");
		m.put("a", "a");
		
		for(Object s : m.values()) {
			System.out.println(s);
		}
		
		Deque<Integer> d = new ArrayDeque<>();
		
		Console console = System.console();
		
		try (DataOutputStream dos =	new DataOutputStream(new FileOutputStream(new File("temp.data")))) {
			
			BufferedReader br = new BufferedReader(new FileReader(new File(""))); //OK tbém
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
