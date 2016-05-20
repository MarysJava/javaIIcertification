package XI.threads.test1;

//This class implements Runnable interface
//Its run method increments the counter three times
class UseCounter implements Runnable {
	public void increment() {
		// increments the counter and prints the value
		// of the counter shared between threads
		Counter.count++;
		System.out.print(Counter.count + " ");
		
		/* The expression Counter.count++ is a write operation, and the next System.out.print statement has a read
operation for Counter.count. When the three threads execute, each of them has a local copy of the value Counter.count
and when they update the counter with Counter.count++, they need not immediately reflect that value in the main
memory. In the next read operation of Counter.count, the local value of Counter.count is printed.

To avoid this problem, you need to ensure that a single thread does the write and read operations together (atomically).
The section of code that is commonly accessed and modified by more than one thread is known as critical section. To avoid the data race problem, you need to ensure that
the critical section is executed by only one thread at a time.

synchronized blocks and synchronized methods
		 */
	}
	
	public void incrementImproved() {
			// These two statements perform read and write operations
			// on a variable that is commonly accessed by multiple threads.
			// So, acquire a lock before processing this "critical section"
		synchronized(this) { //I can't do synchronized (int) -> compile error!
			//I can do synchronized(Counter.class)
			Counter.count++;
			System.out.print(Counter.count + " ");
		}
	}
	
	public void run() {
		incrementImproved();
		incrementImproved();
		incrementImproved();
	}
}