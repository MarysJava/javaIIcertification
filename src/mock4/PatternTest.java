package mock4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(8);
		System.out.println(8 + sb.toString());

		int i = 100;
		double d = 23.20;

		System.out.printf("%1$+.2f", d);
		// Primeiro o %, depois pode colocar o 1$ (posicao), depois flags +, -,
		// (, etc, depois precision .alguma coisa ou width, depois formatador
		// Boolean tem regras especiais, se null = false, se Boolean/boolean
		// retorna o String.valueOf, se outra coisa retorna true
		// Prestar atencao na ordem dos 1$ e 2$ etc...
		System.out.println();

		System.out.printf("%+-5d4", i); // Tanto faz a ordem das flags + e -,
										// mas, - é alinhamento e + é sinal
		// E o sinal conta como parte do width: +100 4 (um espaco só entre o 100
		// e o 4)

		System.out.println();

		System.out.printf("%b", null);

		// Tudo antes do % e depois do formatador será printado como coisa
		// normal.
		// Se nao tiver parametros printf lancará MissingFormatArgumentException
		// Se for parametro errado IllegalFormatConversionException

		System.out.println("\nTest");
		Pattern p = Pattern.compile("0[xX][0-9a-fA-F]?");//("\\s[\\d]*\\s"); //Não pode ter words aqui
		Matcher m = p.matcher("0x12 0x 0 x3abc ab23   0Xfm");
		boolean b = false;
		while (m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
		System.out.println("\nTest");
		
		System.out.println();
		
		p = Pattern.compile("\\ws");
		m = p.matcher("she sells sea shells");
		
		String val = m.replaceAll("X"); //s\\w replace só os 1s //\\ws replace só os ultimos mas come uma letra antes/depois
		//s\\b só os do final das palavras 
		// \\bs só os do comeco das palavras
		System.out.println(val);
		
//		while (m.find()) {
//			System.out.println(m.group());
//		}

		System.out.println();
		String [] spl1 = "name:john;;;sex:m;;;;;;;;;a".split(";");
		//Para cada ; se tiver um espaco ou uma palavra depois da sequencia de ; ele splita, se for final de linha " não splita
		System.out.println(spl1.length);
		for(String s : spl1) {
			if (s.length()<=0) s="oi";
			System.out.println(s);
		}
	
// 		Split - 13 tokens
//		name:john;
//		;
//		;
//		sex:m;
//		;
//		;
//		;
//		;
//		;
//		;
//		;
//		;
//		a
	}

}
