package XII.concurrency.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadFactory;

//A ThreadFactory implementation that sets the thread priority to max for all the threads it creates
class MaxPriorityThreadFactory implements ThreadFactory {
	private static long count = 0;

	public Thread newThread(Runnable r) {
		Thread temp = new Thread(r);
		temp.setName("prioritythread" + count++);
		temp.setPriority(Thread.MAX_PRIORITY);
		return temp;
	}
}

// With the use of ThreadFactory, you can reduce boilerplate code to set thread
// priority, name, thread-pool, etc.

class ARunnable implements Runnable {
	public void run() {
		System.out.println("Running the created thread ");
	}
}

class TestThreadFactory {
	public static void main(String[] args) {
		ThreadFactory threadFactory = new MaxPriorityThreadFactory();
		Thread t1 = threadFactory.newThread(new ARunnable());
		Thread t2 = threadFactory.newThread(new ARunnable());
		System.out.println("The name of the thread is " + t1.getName());
		System.out.println("The priority of the thread is " + t1.getPriority());

		System.out.println("The name of the thread is " + t2.getName());
		System.out.println("The priority of the thread is " + t2.getPriority());

		t1.start();
		t2.start();
	}
}