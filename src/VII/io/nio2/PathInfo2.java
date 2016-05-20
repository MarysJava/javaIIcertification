package VII.io.nio2;

import java.io.File;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

// To illustrate important methods such as normalize(), toAbsolutePath(), and toReativePath()
class PathInfo2 {
	public static void main(String[] args) throws IOException {
		// get a path object with relative path
		Path testFilePath = Paths.get(".\\Test");
		System.out.println("The file name is: " + testFilePath.getFileName());
		System.out.println("It's URI is: " + testFilePath.toUri());
		System.out.println("It's absolute path is: " + testFilePath.toAbsolutePath());
		System.out.println("It's normalized path is: " + testFilePath.normalize());
		// get another path object with normalized relative path
		Path testPathNormalized = Paths.get(testFilePath.normalize().toString());
		System.out.println("It's normalized absolute path is: " + testPathNormalized.toAbsolutePath());
		System.out.println("It's normalized real path is: " + testFilePath.toRealPath(LinkOption.NOFOLLOW_LINKS));

		
		//Resolve example
		
		Path dirName = Paths.get("D:\\OCPJP7\\programs\\NIO2\\");
		Path resolvedPath = dirName.resolve("Test");
		System.out.println(resolvedPath);
		
		//Path has a toFile() method and File has a toPath() method.
		File f = new File("c:\\test1");
		System.out.println(f.toPath());
	
	}
}