package VII.io.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchService;

public class PathResolveTest {
	public static void main(String[] args) {
		Path testFilePath = Paths.get("D:\\test\\test2", "\\testfile.txt");
		Path testFilePath1 = Paths.get("D:\\testfile.txt");
		Path testFilePath2 = Paths.get("D:\\var\\..\\testfile1.txt");
		Path testFilePath3 = Paths.get("D:\\var\\.\\yup\\..\\acm\\testfile1.txt");
		Path testFilePath4 = Paths.get("testfile4.txt");
		Path testFilePath5 = Paths.get("testfile4.txt");
		
		System.out.println("Normalize");
		System.out.println(testFilePath.normalize());
		System.out.println(testFilePath1.normalize());
		System.out.println(testFilePath2.normalize());
		System.out.println(testFilePath3.normalize());
		
		System.out.println("Relativize");
		//Exception IllegalArgumentException Other has different root
		System.out.println(testFilePath.relativize(testFilePath1));
		//Chega a um denominador comum pra mostrar o path
		System.out.println(testFilePath.relativize(testFilePath2));
		System.out.println(testFilePath.relativize(testFilePath3));
		
		System.out.println(testFilePath1.relativize(testFilePath));
		System.out.println(testFilePath2.relativize(testFilePath3));
		System.out.println("A:"+testFilePath.relativize(testFilePath));
		
		System.out.println("Resolve");
		
		System.out.println(testFilePath.resolve(testFilePath1));
		System.out.println(testFilePath.resolve(testFilePath2));
		System.out.println(testFilePath.resolve(testFilePath3));
		System.out.println(testFilePath1.resolve(testFilePath));
		System.out.println(testFilePath1.resolve(testFilePath2));
		
		System.out.println("B: "+testFilePath.resolve(testFilePath4));
		
		//Emenda Paths, então se não tem nada a ver printa o segundo, senão emenda o 2o no primeiro.
	
//		System.out.println(testFilePath4.toAbsolutePath()); //current file or work dir
//		try {
//			System.out.println(testFilePath4.toRealPath(LinkOption.NOFOLLOW_LINKS)); //NoSuchFileException
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println(testFilePath4.compareTo(testFilePath5));
		System.out.println(testFilePath4.equals(testFilePath5));
		try {
			System.out.println(Files.isSameFile(testFilePath4, testFilePath5));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WatchService watchService = null;
		try {
			watchService = testFilePath.getFileSystem().newWatchService();
			//FileSystems.getDefault().newWatchService();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
