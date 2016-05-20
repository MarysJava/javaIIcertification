package mock3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Boundary {
	public static void main(String[] args) {
		String str = "o brother, where art thou! boo man o";
		String rex = "\\bo";
		// \\B não processa espaços mas processa X após caracter especial, e não
		// de palavras
		// \\w processa todas as palavras
		// \\W processa todos os espaços
		String replace = "X";
		Pattern p = Pattern.compile(rex);
		Matcher m = p.matcher(str);
		String val = m.replaceAll(replace);
		System.out.println(val);
	}

	/*
	 * \\b means a word boundary. Therefore, \\bo will match any o immediately
	 * follows a word boundary, which means a tab, a space, a beginning of a
	 * line, an end of a line, and special characters. In other words, a word
	 * boundary matches any character that is generally not used in making
	 * words. In this case, only the first o edges a word boundry; all others
	 * are within a word. Therefore, only the first o is a match and it is
	 * replaced with X.
	 * 
	 */
}
