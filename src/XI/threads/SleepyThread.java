package XI.threads;

//This Thread class just invokes sleep method after acquiring lock on its class object
class SleepyThread extends Thread {
	public void run() {
		synchronized (SleepyThread.class) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				// its okay to ignore this exception since we're not
				// interrupting exceptions in this code
				ie.printStackTrace();
			}
		}
	}
}