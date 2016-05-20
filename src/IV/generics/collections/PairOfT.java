package IV.generics.collections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class PairOfT<T> { //extends LinkedList & Deque & List> { // Can be done, one class only and one or more interfaces, and the class must be the first one
	T object1;
	T object2;

	PairOfT(T one, T two) {
		object1 = one;
		object2 = two;
	}

	public T getFirst() {
		return object1;
	}

	public T getSecond() {
		return object2;
	}
	
	public static void main(String[] args) {
		PairOfT<String> worldCup = new PairOfT<>("2010" , "South Africa"); //OK
		PairOfT<String> worldCup1 = new PairOfT(2010, "South Africa"); //NOT OK
		//SEM O <> AINDA QUE VAZIO NA DIREITA ELE ACEITA 2010 COMO INTEGER E GERA RUNTIME EXCEPTION
		System.out.println("World cup " + worldCup.getFirst() + " in " + worldCup.getSecond());
	}
}