package mock2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

class PathInfo {
	public static void main(String[] args) {
		Path aFilePath = Paths.get("D:\\dir\\file.txt");
		Path aFilePath1 = Paths.get("aaa\\file.txt");
		Path p = aFilePath.resolve(aFilePath1); //Ou retorna o 2o ou resolve por ex  D:\\dir\\aaa\\file.txt
		//Resolve a partir do root, neste caso D:\\aaa\\file.txt se o 2o path for \\aaa alguma coisa
		//Mas se nao tem \\ no 2o path ele soma o 2o no primeiro como em D:\dir\file.txt\aaa\file.txt
		System.out.println(p);
//		Iterator<Path> paths = aFilePath.iterator();
//		System.out.println(aFilePath.getRoot());
//		while (paths.hasNext()) {
//			System.out.print(paths.next() + " ");
//		}
	}
	
	//Se Roots diferentes ou SEM ROOT ava.lang.IllegalArgumentException: 'other' is different type of Path
	//Se dois paths sao iguais nao printa NADA (mesmo path, nao tem o que relativizar)
}