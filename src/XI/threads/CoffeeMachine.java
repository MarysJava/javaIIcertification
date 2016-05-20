package XI.threads;

//The CoffeeMachine class runs as an independent thread.
//Once the machine makes a coffee, it notifies the waiter to pick it up.
//When the waiter asks the coffee machine to make a coffee again,
//it starts all over again, and this process keeps goes on . . .

class CoffeeMachine extends Thread {
	static String coffeeMade = null;
	static final Object lock = new Object(); //The lock member is for the synchronization between the CoffeeMachine and Waiter threads.
	private static int coffeeNumber = 1;

	synchronized static void makeCoffee() {
		synchronized (CoffeeMachine.lock) { 
		// I can get lock in any class or object - the lock could be and String (new String ), but could NOT be a primitive value
		// But need to be some attribute of CoffeeMachine 
		// CoffeeMachine.class could not be use since I need to call notifyAll in an object in Waiter.class
		// If I use CoffeeMachine.class I'll get an IllegalMonitorStateException
			if (coffeeMade != null) {
				try {
					// System.out.println("Coffee machine: Waiting for waiter
					// notification to deliver the coffee");
					CoffeeMachine.lock.wait(); //Se alguma condição então esta thread espera outra
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
			}
			coffeeMade = "Coffee No. " + coffeeNumber++;
			System.out.println("Coffee machine says: Made " + coffeeMade);
			// once coffee is ready, notify the waiter to pick it up
			CoffeeMachine.lock.notifyAll(); //Uma vez feito o que tem que fazer, notifica outras threads que encerrou
			System.out.println("Coffee machine: Notifying waiter to pick the coffee ");
		}
	}

	public void run() {
		while (true) {
			makeCoffee();
			try {
				System.out.println("Coffee machine: Making another coffee now");
				// simulate the time taken to make a coffee by calling sleep
				// method
				Thread.sleep(10000);
			} catch (InterruptedException ie) {
				// its okay to ignore this exception
				// since we're not using thread interrupt mechanism
				ie.printStackTrace();
			}
		}
	}
}