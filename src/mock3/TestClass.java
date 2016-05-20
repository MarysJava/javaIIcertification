package mock3;

public class TestClass {
	public class A {
	}

	public static class B {
	}

	public static void main(String args[]) {
		class C {
		}
		
		new TestClass().new A();
		new TestClass.B();
		new C();
	}
}