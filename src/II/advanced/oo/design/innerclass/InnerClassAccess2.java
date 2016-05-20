package II.advanced.oo.design.innerclass;

class Outer1 {
	static class Inner {
		public final String text = "Inner";
		
		static class InnerInner {
			public final String text = "Inner";
		}
	}
}

public class InnerClassAccess2 {
	public static void main(String[] args) {
		System.out.println(new Outer1.Inner().text);
		// Por mais estranho que possa parecer, a classe Outer não é estática (não se pode ter Outer class static)
		// A classe Inner é estática, mas recebe o ()
		// Um só new e o () na frente da segunda classe
		
		System.out.println(new Outer1.Inner.InnerInner().text);
		// O () vai sempre na Ultima classe
	}
}