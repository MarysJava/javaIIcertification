package IV.generics.collections;

import java.util.ArrayList;
import java.util.List;

class Utilities {
	public  final <P, T> void fill(List<P> list, T val) { //static e final sempre antes do generics e tipo de retorno sempre depois
	//	for (int i = 0; i < list.size(); i++)
		//	list.set(i, val);
	}
	
	public  final <T> List<T> fill1(List<T> list, T val) { //static e final sempre antes do generics e tipo de retorno sempre depois
			for (int i = 0; i < list.size(); i++)
				list.set(i, val);
			return list;
		}

	//Here T and P needed to be declared, different from use wildcard ?

	public static void main(String[] args) {
		List<String> intList = new ArrayList<String>();
		intList.add("10");
		intList.add("20");
		System.out.println("The original list is: " + intList);
		new Utilities().fill(intList, 100);
		System.out.println("The list after calling Utilities.fill() is: " + intList);
		
		//Subtyping does not work for generic parameters.
	}
}