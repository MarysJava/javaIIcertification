package mock2;

import java.util.PriorityQueue;

class PQueueTest {
	public static void main(String[] args) {
		PriorityQueue<Integer> someValues = new PriorityQueue<Integer>();
		someValues.add(new Integer(10));
		someValues.add(new Integer(15));
		someValues.add(new Integer(5));
		Integer value;
		while ((value = someValues.poll()) != null) {
			System.out.print(value + " ");
		}
	}
}