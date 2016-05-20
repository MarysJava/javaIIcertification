package XI.threads;

class ThreadStateProblem1 extends Thread {
	
	// Call wait and notify/notifyAll only after acquiring the relevant lock.
	// To ensure the lock acquisition use synchronized 
	synchronized public void run() {
		try {
			wait(1000); //Só posso chamar wait se tiver lock (método ou bloco synchronized)
			/*
			 * Since the run() method is synchronized, wait() will add itself to the this object reference lock. Since there is no
one calling the notify()/notifyAll() method, after a timeout of 1 second (1000 milliseconds) is over, it will return from
the run() method. So, the wait(1000); statement behaves almost like a sleep(1000) statement; the difference is that
calling wait() releases the lock on this object when it waits while sleep() call will not release the lock when it sleeps.
			 */
		} catch (InterruptedException ie) {
			// its okay to ignore this exception since we're not
			// interrupting exceptions in this code
			ie.printStackTrace();
		}
	}

	/*
	 * The wait(int) method (with or without timeout value) should be called only after acquiring a lock: a wait() call
adds the thread to the waiting queue of the acquired lock. If you don’t do that, there is no proper transition from the
running state to timed_waiting (or waiting state, if a timeout value is not given) to happen. So, the program crashes by
throwing an IllegalMonitorStateException exception.
The correct fix is to acquire the lock before calling wait(). In this case, you can declare the run() method
synchronized.
	 */
	
	
	public static void main(String[] s) {
		new ThreadStateProblem1().start();
	}
}