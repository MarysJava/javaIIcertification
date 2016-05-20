package XI.threads;

class ThreadStateProblem extends Thread {

	 public synchronized void run() {
		System.out.println("Test");
	}
	
	public static void main(String[] s) {
		Thread thread = new ThreadStateProblem();
		thread.start(); //Execute this and print Test
 		thread.start(); // Throws a IllegalThreadStateException
	}
}