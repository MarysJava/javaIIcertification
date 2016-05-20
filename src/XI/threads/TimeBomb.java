package XI.threads;

class TimeBomb extends Thread {
	String[] timeStr = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

	// You must provide a try-catch block to handle this exception within run().
	public void run() {
		for (int i = 9; i >= 0; i--) {
			try {
				System.out.println(timeStr[i]);
				Thread.sleep(1000); // Throws InterruptedException
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] s) {
		TimeBomb timer = new TimeBomb();
		System.out.println("Starting 10 second count down. . . ");
		timer.start();

		try {
			timer.join(); // Thread main waits for thread timer die - IMPORTANT
			//Even if I call wait (and get an Exception) since I have already call start run will run
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

		System.out.println("Boom!!!");
	}
}