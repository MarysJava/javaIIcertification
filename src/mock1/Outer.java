package mock1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Outer {
	private int mem = 10;

	static class Inner {
		private int imem = new Outer().mem; // ACCESS1
	}

	public static void main(String[] s) {
		System.out.println(new Outer.Inner().imem); // ACCESS2

		C.foo(new C()); // Compila mas fica como RAW TYPE
		
		
		String hello = "hello";
		String world = "world";
		StringBuffer helloWorld = new StringBuffer(hello + world);
		List<String> list = Arrays.asList(hello, world, helloWorld.toString());
		helloWorld.append("!");
		list.remove(0); // REMOVE
		System.out.println(list);

	}

	static class C<T> {
		static void foo(C<? super DI> arg) {
		}
	}

	interface BI {
	}

	interface DI extends BI {
	}

	interface DDI extends DI {
	}

	class CountryComparator implements Comparator<String> {
		public int compare(String country1, String country2) {
			return country2.compareTo(country2); // COMPARE_TO
		}
	}
}