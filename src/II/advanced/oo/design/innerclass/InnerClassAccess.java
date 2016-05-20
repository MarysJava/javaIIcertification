package II.advanced.oo.design.innerclass;

class Outer {
	 class Inner {
		public final String text = "Inner";
		
		 class InnerInner {
			public final String text = "Inner";
		}
	}
}

public class InnerClassAccess {
	public static void main(String[] args) {
		System.out.println(new Outer().new Inner().text);
		// Por mais estranho que possa parecer, a classe Outer não é estática (não se pode ter Outer class static)
		// A classe Inner é estática, mas recebe o ()
		// Um só new e o () na frente da segunda classe
		
		System.out.println(new Outer().new Inner().new InnerInner().text);
		// O text é específico, mesmo nome mas é da InnerInner, não dá problema
		
		// O () vai sempre na Ultima classe se for estática
		// Senão, sempre vai ter um new e () em todas as classes
	}
}