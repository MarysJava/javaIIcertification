package VII.io.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

//illustrates how to use compareTo and equals and also shows the difference between the two methods
class PathCompare1 {
	public static void main(String[] args) {
		Path path1 = Paths.get("Test");
		Path path2 = Paths.get("C:\\workspace\\JavaIICertification\\Test");
		// comparing two paths using compareTo() method
		System.out.println("(path1.compareTo(path2) == 0) is: " + (path1.compareTo(path2) == 0));
		// comparing two paths using equals() method
		System.out.println("path1.equals(path2) is: " + path1.equals(path2));
		// comparing two paths using equals() method with absolute path
		System.out.println(path1.toAbsolutePath());
		System.out.println(path2.toAbsolutePath());
		System.out.println("path2.equals(path1.toAbsolutePath()) is " + path2.equals(path1.toAbsolutePath()));
		System.out.println("path2.compareTo(path1.toAbsolutePath()) is " + path2.compareTo(path1.toAbsolutePath()));
	}
}