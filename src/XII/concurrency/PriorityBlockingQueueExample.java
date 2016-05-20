package XII.concurrency;

import java.util.concurrent.PriorityBlockingQueue;

class PriorityBlockingQueueExample {
	public static void main(String[] args) {
		final PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();
		new Thread() {
			public void run() {
				try {
					// use take() instead of remove()
					// note that take() blocks, whereas remove() doesn't block
					System.out.println("The removed element is: " + priorityBlockingQueue.take());
				} catch (InterruptedException ie) {
					// its safe to ignore this exception
					ie.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				// add an element with value 10 to the priority queue
				priorityBlockingQueue.add(10);
				System.out.println("Successfully added an element to the queue ");
			}
		}.start();
	}
}

/*
 * This program will not result in a crash as in the previous case (Listing 14-6). This is because the take() method
will block until an element gets inserted by another thread; once inserted, the take() method will return that value.
In other words, if you’re using a PriorityQueue object, you need to synchronize the threads such that insertion of an
element always occurs before removing an element. However, in PriorityBlockingQueue, the order does not matter,
and no matter which operation (insertion or removal of an element) is invoked first, the program works correctly. In
this way, concurrent collections provide support for safe use of collections in the context of multiple threads without
the need for you to perform explicit synchronization operations.
 */
