package mock4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NavigableSet;
import java.util.TreeSet;

interface A {
	int value1 = 20;
}

class B implements A {
	int value1 = 10;
	//Compila, mas sempre que a var de referencia for da interface e chamar value1 pega o da interface
}

public class Test2 {
	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		System.out.println(a.value1+" "+b.value1);
		
		Deque d = new ArrayDeque<>();
		
		NavigableSet<String> ss = new TreeSet<>();
		ss.add("a");
		ss.add("b");
		ss.add("c");
		ss.add("aa");
		ss.add("bb");
		ss.add("cc");
		
		System.out.println(ss);

		System.out.println(ss.floor("a")); //Prints a (imediatamente abaixo ou o mesmo)
		System.out.println(ss.ceiling("cc")); //Considera que aaaa vem antes do b, retorna b, se fosse bbbb retornaria c (imediatamente acima ou o mesmo)
		System.out.println(ss.lower("a")); //imediatamente menor
		System.out.println(ss.higher("c")); //Lembrar que é ordenado, depois do bb vem o c //imediatamente maior
		//NavigableSet: [a, aa, b, bb, c, cc]
		//Ex. floor a =a, ceiling cc = cc, lower a = null, higher cc = null

		//Note that methods of NavigableMap (such as ceilingEntry(), ceilingKey(), floorEntry(), floorKey() etc.) also work exactly the same way.
		
		
	}
}