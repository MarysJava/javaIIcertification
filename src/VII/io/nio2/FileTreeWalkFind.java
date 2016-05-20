package VII.io.nio2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

class MyFileFindVisitor extends SimpleFileVisitor<Path> {
	private PathMatcher matcher;

	public MyFileFindVisitor(String pattern) {
		try {
			matcher = FileSystems.getDefault().getPathMatcher(pattern);
		} catch (IllegalArgumentException iae) {
			System.err.println("Invalid pattern; did you forget to prefix \"glob:\"? (as in glob:*.java)");
			System.exit(-1);
		}
	}

	public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {
		find(path);
		return FileVisitResult.CONTINUE;
	}

	private void find(Path path) {
		Path name = path.getFileName();
		if (matcher.matches(name))
			System.out.println("Matching file:" + path.getFileName());
	}

	public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes fileAttributes) {
		find(path);
		return FileVisitResult.CONTINUE;
	}
}

public class FileTreeWalkFind {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("usage: FileTreeWalkFind <start-path> <pattern to search>");
			System.exit(-1);
		}
		Path startPath = Paths.get(args[0]);
		String pattern = args[1];
		try {
			Files.walkFileTree(startPath, new MyFileFindVisitor(pattern));
			System.out.println("File search completed!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}