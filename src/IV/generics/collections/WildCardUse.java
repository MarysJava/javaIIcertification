package IV.generics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//This program demonstrates the usage of wild card parameters
class WildCardUse {
	static void printList(List<?> list) {
		for (Object l : list)
			System.out.println("[" + l + "]");
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(100);
		printList(list);

		List<String> strList = new ArrayList<>();
		strList.add("10");
		strList.add("100");
		printList(strList);

		// List<?> wildCardList = new ArrayList<Integer>();
		// wildCardList.add(new Integer(10)); //DON'T COMPILE
		// System.out.println(wildCardList);

		/*
		 * IMPORTANT! When you use wildcard parameters, you cannot call methods
		 * that modify the object. If
		 * 
		 * When you use wildcard type <?>, you say to the compiler that you are
		 * ignoring the type information, so <?> stands for unknown type. Every
		 * time you try to pass arguments to a generic type, the java compiler
		 * tries to infer the type of the passed argument as well as the type of
		 * the generics and to justify the type safety. Now, you are trying to
		 * use the add() method to insert an element in the list. Since
		 * wildCardList doesn’t know which type of objects it holds, it is risky
		 * to add elements to it. You might end up adding a string—“hello”, for
		 * example—instead of an integer value. To avoid this problem (remember,
		 * generics was introduced in the language to ensure type safety!), the
		 * compiler doesn’t allow you to call methods that modify the object.
		 * Since the add method modifies the object, you get an error!
		 */

		// Bounded Wildcards

		List<?> numList = new ArrayList<Integer>();
		numList = new ArrayList<String>(); // Compiles fine =O

		List<? extends Number> numList1 = new ArrayList<Integer>(); // Bounded
																	// Wildcards
		// numList1 = new ArrayList<String>(); //NOT OK

		List<? extends Number> numList2 = new ArrayList<Integer>();
		numList2 = new ArrayList<Double>(); // OK BECAUSE DOUBLE EXTENDS NUMBER
		
		List<Double> doubleList = new ArrayList<Double>();
		for(int i = 0; i < 5; i++) 
			doubleList.add(new Double((i * i))); //OR CAST TO double, CAN'T CAST TO wrapper class Double!
			

		List<? super Integer> intList = new ArrayList<Integer>(); 
		List<? super Integer> intList1 = new ArrayList<Number>();
		System.out.println("The intList is: " + intList);
		
		List<Number> myListNumber = new ArrayList<>();
		printList2(myListNumber);
		
		// ? extends class = all subtypes of class, including class
		// ? super class = all supertypes of class, including class
		
		/*
		 * In the bounded wildcard, <? extends X>, X may be a class or an interface (note that even for interfaces
you use the extends keyword). the valid substitution for ? is not just any of its derived classes and
interfaces; you can substitute ? for X itself! this is also applicable with <? super X> expressions.
		 */
		
		List<? extends List> intList2 = new ArrayList<ArrayList>(); //Can be an interface: ? extends List
		List<? extends List> intList3 = new ArrayList<List>();
		
		//List<? extends ArrayList & List> intList10 = new ArrayList<List>(); //To variable don't compile
		
		List<? super Double> numList3 = new ArrayList<Double>();  //If user super or extends, fill MUST use the same (super-super / extends-extends)
		WildCardUse.fill(numList3, 10.0);
		
		//Method Copy Test
		
		List<? super Object> intList4 = new ArrayList<Object>();//Collections.nCopies(5, new Integer(10));
		for(int i = 0; i < 5; i++) {
			intList4.add(new Object());
		}
		
		List<Object> objList = new ArrayList<Object>();
		for(int i = 0; i < 5; i++) {
			objList.add(new Object()); //Can't modify list if has wildcard
		}
		Collections.copy(intList4, objList);
		System.out.println("The objList is: " + objList);
		
		
	}

	static <T extends Number> List<T> nCopies(int num, T obj) { return new ArrayList<T>(); } //Ok to return a List<T> - use T or <> in the return object - must match with the other side declared in the method signature
	static <T> void fill(List<? super T> list, T obj) {} //OK T and Wildcars

	static void printList1(List<? extends Number> list) {
		for (Object l : list)
			System.out.println("[" + l + "]");
	}
	
	static void printList2(List<? super Number> list) {
		for (Object l : list)
			System.out.println("[" + l + "]");
	}
	
	/*The List returned by nCopies is a
read-only list and if you use that List as a target for the copy() method, you’ll get an
UnsupportedOperationException

When you use (or want to use) <T>, <?>, <? extends T>, or <? super T> with a specific type,
substitute the T with the actual type and visualize how the replaced type would look. This is the
easiest way to understand the correct usage of generics with wildcards in collection classes.
	 * 
	 */
}