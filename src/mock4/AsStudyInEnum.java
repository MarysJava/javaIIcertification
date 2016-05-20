package mock4;

enum Y { Y1, Y2, Y3 } //Não pode ser público senão o nome do arquivo tem que ser Y, já tem outra classe pública
//AsStudyInEnum e só pode 1 public por aquivo que é o mesmo nome do arquivo.

public class AsStudyInEnum {

	enum X { X1, X2, X3 }
	
	public AsStudyInEnum () {
		System.out.println(X.X1+" "+Y.Y1);
	}

	public static void main(String[] args) {
		new AsStudyInEnum();
		
		String s = "going";
		print(s, s = new String("gone")); // Só muda s depois de avaliar a 1a clausula, entao o 1o s fica going
	}
	
	public static void print(String a, String b) {
		System.out.println(a+" "+b);
	}
}
