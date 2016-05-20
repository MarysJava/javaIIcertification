package mock4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Person {

	private String name;

	public Person(String name) { 
		this.name = name;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}

class Helper {
	public void helpPeople(Queue people, Queue helped) { //Se Queue<Person> então não compilaria a linha lá embaixo
		do {
			Person p = (Person) people.poll();
			System.out.println("Helped : " + p + " ");
			helped.offer(p.getName()); //Aqui Queue é raw type (aceita Object) então isto compila OK com warning
		} while (!people.isEmpty());
	}

	public static void main(String[] args) {
		Queue<Person> q = new LinkedList<Person>();
		q.offer(new Person("Pope"));
		q.offer(new Person("John"));
		Queue<Person> helpedQ = new LinkedList<Person>();
		Helper h = new Helper();
		h.helpPeople(q, helpedQ);
		//h.offer("teste"); //Aqui usa generics (type-safe) e não pode add String
	}
}