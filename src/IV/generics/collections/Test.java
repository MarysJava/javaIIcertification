package IV.generics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LastError<T> {
	private T lastError;

	void setError(T t) {
		lastError = t;
		System.out.println("LastError: setError");
	}
}

class StrLastError<S extends CharSequence> extends LastError<String> {
	public StrLastError(S s) {
	}

	void setError(S s) {
		System.out.println("StrLastError: setError");
	}

	public static  void testWildcard(List<?> wildList){}
	
	public static <T, F> List<? super F> testWildcard1(List<? extends F> wildList){ return null; }
	//Wildcard não precisa ser declarado na assinatura do método, T ou outros precisa
	
//	In the bounded wildcard, <? extends X>, X may be a class or an interface (note that even for interfaces
//			you use the extends keyword). the valid substitution for ? is not just any of its derived classes and
//			interfaces; you can substitute ? for X itself! this is also applicable with <? super X> expressions.
	}


public class Test {
	public static void main(String[] args) {
		StrLastError<String> err = new StrLastError<String>("Error");
		//err.setError("Last error");
		
		//The nCopies method returns a read-only List of num elements with value obj. Here is an example:
		System.out.println("List of 5 elements filled with values 10: " + Collections.nCopies(5, 10));
		//static void reverse(List<?> list);
		//static <T> void fill(List<? super T> list, T obj)
		//static <T> void copy(List<? super T> dest, List<? extends T> src); //T é igual (Number no ex) e ? varia
		
		List<Integer> intList = Collections.nCopies(5, new Integer(10));
		List<Object> objList = new ArrayList<Object>();
		for (int i = 0; i < 5; i++) {
			objList.add(new Object());
		}
		Collections.copy(objList, intList);
		System.out.println("The objList is: " + objList);
	}
}
