package mock1;

import java.util.Locale;

class Base {
	protected void finalize() {
		System.out.println("in Base.finalize");
	}
}

class Derived extends Base {
	protected void finalize() {
		System.out.println("in Derived.finalize");
	}
}

class Test {
	public static void main(String[] args) {
		Base d = new Derived();
		d = null;
		Runtime.runFinalizersOnExit(true);
	}
}