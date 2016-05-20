package mock3;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Path3 extends SimpleFileVisitor<Path> {

	private PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:*.{pdf,rtf}");

	public FileVisitResult visitFile(Path file,  BasicFileAttributes attr) { 
		if(pm.matches(file.getFileName())){ 
			System.out.println("Got : "+file.getFileName()); 
			}
		return FileVisitResult.CONTINUE;
		}

	public static void main(String[] args) throws IOException{
			Path3 p3 = new Path3(); 
			Path startwith = Paths.get("C:\\Users\\IBM_ADMIN\\Documents\\CertificacaoJavaII"); 
			Files.walkFileTree(startwith, p3);
		}
}