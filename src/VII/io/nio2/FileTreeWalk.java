package VII.io.nio2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
	public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {
		System.out.println("file name:" + path.getFileName());
		return FileVisitResult.CONTINUE;
	}

	public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes) {
		System.out.println("----------Directory name:" + path + "----------");
		return FileVisitResult.CONTINUE;
	}
}

public class FileTreeWalk {
	public static void main(String[] args) {
		Path pathSource = Paths.get("/var/www/html");
		try {
			Files.walkFileTree(pathSource, new MyFileVisitor());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}