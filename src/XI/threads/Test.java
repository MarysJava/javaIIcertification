package XI.threads;

class ExtendThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new ExtendThread(), "thread1 ");
		Thread thread2 = new Thread(thread1, "thread2 ");
		//Creating a NEW ok, different from doing Thread thread2 = thread1; In this case it will throw IllegalThreadStateException in second start
		// If I do Thread thread2 = new Thread(thread1) it's a new thread and it will receive a new name (not same name of first thread)
		thread1.start();
		thread2.start();
		
		//thread1.start(); // START
	}
}