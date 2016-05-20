package mock3;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		String[] names = {"Alex", "Bob", "Charlie" };
		List<?> list = new ArrayList<String>(Arrays.asList(names));
		
		System.out.printf("%1$s %2$s %<s", "A", "B", "C"); //Prints ABB
		
		String s = "12 3abc ab23";
		Pattern p = Pattern.compile("\\s[\\d]*\\s");
		Matcher m = p.matcher(s);
		boolean b = false;
		while(b = m.find()) {
			System.out.println(m.start()+" "+m.group());
		} 
		
		System.out.println();
		Path p1 = Paths.get("\\photos\\vacation");
		Path p2 = Paths.get("\\yellowstone");
		System.out.println(p1.resolve(p2)+"  "+p1.relativize(p2));
	}

	public class TesteInner{
		final static String a="a";
	}
	
	
}
