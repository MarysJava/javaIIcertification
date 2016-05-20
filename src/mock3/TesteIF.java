package mock3;

interface I {
}

class A implements I {
}

class B extends A {
}

class C extends B {
}

public class TesteIF {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		I i = new C();

		a = (B) (I) b;
	}
}
