package VII.io.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathCompare2 {
	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("Test");
		Path path2 = Paths.get("C:\\workspace\\JavaIICertification\\Test");
		System.out.println("Files.isSameFile(path1, path2) is: " + Files.isSameFile(path1, path2));

		Path path = Paths.get("C:\\workspace\\JavaIICertification\\Test\\testfile");
		if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
			System.out.println("The file/directory " + path.getFileName() + " exists");
			// check whether it is a file or a directory
			if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
				System.out.println(path.getFileName() + " is a directory");
			} else {
				System.out.println(path.getFileName() + " is a file");
				System.out.printf( "Readable: %b, Writable: %b, Executable: %b ",
						Files.isReadable(path), Files.isWritable(path), Files.isExecutable(path));
				
				Object object = Files.getAttribute(path, "creationTime", LinkOption.NOFOLLOW_LINKS);
				System.out.println("Creation time: " + object);
				object = Files.getAttribute(path, "lastModifiedTime", LinkOption.NOFOLLOW_LINKS);
				System.out.println("Last modified time: " + object);
				object = Files.getAttribute(path, "size", LinkOption.NOFOLLOW_LINKS);
				System.out.println("Size: " + object);
				object = Files.getAttribute(path, "dos:hidden", LinkOption.NOFOLLOW_LINKS);
				System.out.println("isHidden: " + object);
				object = Files.getAttribute(path, "isDirectory", LinkOption.NOFOLLOW_LINKS);
				System.out.println("isDirectory: " + object);
				
				System.out.println();
				
				BasicFileAttributes fileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
				System.out.println("File size: " + fileAttributes.size());
				System.out.println("isDirectory: " + fileAttributes.isDirectory());
				System.out.println("isRegularFile: " + fileAttributes.isRegularFile());
				System.out.println("isSymbolicLink: " + fileAttributes.isSymbolicLink());
				System.out.println("File last accessed time: " + fileAttributes.lastAccessTime());
				System.out.println("File last modified time: " + fileAttributes.lastModifiedTime());
				System.out.println("File creation time: " + fileAttributes.creationTime());
			}
		} else

		{
			System.out.println("The file/directory " + path.getFileName() + " does not exist");
		}
	}
	
	public static <A extends BasicFileAttributes> A readAttributes(Path path, Class<A> type, LinkOption... options){ return null; }
}
