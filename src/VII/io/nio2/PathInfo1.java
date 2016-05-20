package VII.io.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

//Class to illustrate how to use Path interface and its methods
public class PathInfo1 {
	public static void main(String[] args) {
		// create a Path object by calling static method get() in Paths class
		Path testFilePath = Paths.get("D:\\test\\test2\\testfile.txt");
		// retrieve basic information about path
		System.out.println("Printing file information: ");
		System.out.println("\t file name: " + testFilePath.getFileName());
		System.out.println("\t root of the path: " + testFilePath.getRoot());
		System.out.println("\t parent of the target: " + testFilePath.getParent());
		System.out.println("\t Subpath: " + testFilePath.subpath(0, 2));
		System.out.println("\t element.getNameCount(): " + testFilePath.getNameCount());
		System.out.println("\t element.getName(0): " + testFilePath.getName(0));
		// print path elements
		System.out.println("Printing elements of the path: ");
		for (Path element : testFilePath) {
			System.out.println("\t path element: " + element);
		}
	}
}