package VII.io.nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

class Relativize {
	public static void main(String[] args) {
		Path javaPath = Paths.get("D:\\OCPJP7\\programs\\NIO2\\src\\Test").normalize();
		Path classPath = Paths.get("D:\\OCPJP7\\programs\\NIO2\\Relativize.class").normalize();
		
		System.out.println("Relativize: "+javaPath.relativize(classPath));
		System.out.println("Resolve:: "+classPath.resolve(javaPath));
		
		System.out.println(javaPath);
		System.out.println(classPath);
		
		Path result = javaPath.relativize(classPath);
		System.out.println(result);
		
		if (result == null) {
			System.out.println("relativize failed");
		} else if (result.equals(Paths.get(""))) {
			System.out.println("relative paths are same, so relativize returned empty path");
		} else {
			System.out.println(result);
		}
		
		System.out.println("****");
		
		Path aPath = Paths.get("D:\\OCPJP7\\programs\\..\\NIO2\\src\\.\\SubPath.java");
		aPath = aPath.normalize();
		System.out.println(aPath);
		System.out.println(aPath.subpath(2, 3));
	}
}