package XII.concurrency;

import java.util.PriorityQueue;

//Simple PriorityQueue example. Here, we create two threads in which one thread inserts an element,
//and another thread removes an element from the priority queue.
class PriorityQueueExample {
	public static void main(String[] args) {
		final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		// spawn a thread that removes an element from the priority queue
		new Thread() {
			public void run() {
				// Use remove() method in PriorityQueue to remove the element if available
				System.out.println("The removed element is: " + priorityQueue.remove());
			}
		}.start();
		// spawn a thread that inserts an element into the priority queue
		new Thread() {
			public void run() {
				// insert Integer value 10 as an entry into the priority queue
				priorityQueue.add(10);
				System.out.println("Successfully added an element to the queue ");
			}
		}.start();
	}
}