package mock4;

public class SplitTest {
	public static void main(String[] args) {
		String s = "boo:and:foo";

//		print(s.split(":", 2));
//		print(s.split(":", 5));
//		print(s.split(":", -2));
//		print(s.split(":", 0));
		
		print(s.split("o", 2)); //Nao considera o caracter do split
		print(s.split("o", 5));
		print(s.split("o", -2));
		print(s.split("o", 0)); //Se tiver espaco ou outra string apos ele considera e splita mais, senao, nao splita (se for end of line)
	}

	public static void print(String [] spl1) {
		System.out.println();
		System.out.println("s.len "+spl1.length);
		for (String s : spl1) {
			if(s.length()<=0) s=";";
			System.out.println(s);
		}
	}
}
