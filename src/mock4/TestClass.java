package mock4;

class TestClass {

	void probe(int x) {
		System.out.println("In ...");
	}

	void probe(Integer x) {
		System.out.println("In Integer");
	}

	void probe(long x) {
		System.out.println("In long");
	}

	void probe(Long x) {
		System.out.println("In LONG");
	}

	void probe(Object x) {
		System.out.println("In double");
	}

	
	public static void main(String[] args) {
		Integer a = 4;
		long ll=10l;
		new TestClass().probe(a);
		int b = 4;
		new TestClass().probe(b); 
		double ad = 10;
		new TestClass().probe(ad);
		new TestClass().probe(ll);
		//Em qualquer wrapper que não seja Double, em qualquer var que nao seja (double) ou usando cast explicito (apenas para primitivo)
		// e em qualquer coisa que nao seja uma superclasse como Number, Object, não compila
	}
}
