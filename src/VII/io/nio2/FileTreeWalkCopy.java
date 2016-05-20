package VII.io.nio2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

//Our File visitor implementation that performs copy
class MyFileCopyVisitor extends SimpleFileVisitor<Path> {
	private Path source, destination;

	public MyFileCopyVisitor(Path s, Path d) {
		source = s;
		destination = d;
	}

	public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {
		System.out.println("File visit path: "+path);
		Path p = source.relativize(path);
		Path newd = destination.resolve(p);
		System.out.println("File visit resolved path "+ newd);
		System.out.println();
		try {
			Files.copy(path, newd, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return FileVisitResult.CONTINUE;
	}

	public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes) {
		System.out.println("Pre visit path: "+path);
		Path p = source.relativize(path);
		Path newd = destination.resolve(p);
		System.out.println("Pre visit resolved "+newd);
		System.out.println();
		try {
			Files.copy(path, newd, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return FileVisitResult.CONTINUE;
	}
}

public class FileTreeWalkCopy {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("usage: FileTreeWalkCopy <source-path> <destination-path>");
			System.exit(1);
		}
		Path pathSource = Paths.get(args[0]);
		Path pathDestination = Paths.get(args[1]);
		try {
			Files.walkFileTree(pathSource, new MyFileCopyVisitor(pathSource, pathDestination));
			System.out.println("Files copied successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}