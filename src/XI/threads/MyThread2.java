package XI.threads;

class MyThread2 implements Runnable {
	public void run() {
		System.out.println("In run method; thread name is: " + Thread.currentThread().getName());
	}

	public static void main(String args[]) throws Exception {
		Thread myThread = new Thread(new MyThread2());
		myThread.setName("SimpleThread");
		myThread.setPriority(9);
		System.out.println(myThread); //Prints toString() - name, priority and thread group
		myThread.start();
		System.out.println("In main method; thread name is: " + Thread.currentThread().getName());
	}
}