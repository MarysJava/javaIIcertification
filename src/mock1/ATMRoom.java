package mock1;

import java.util.concurrent.Semaphore;

class ATMRoom {
	public static void main(String[] args) {
		Semaphore machines = new Semaphore(1); // #1
		new Person(machines, "Mickey");
		new Person(machines, "Donald");
		new Person(machines, "Tom");
		new Person(machines, "Jerry");
		new Person(machines, "Casper");
	}
}

class Person extends Thread {
	private Semaphore machines;

	public Person(Semaphore machines, String name) {
		this.machines = machines;
		this.setName(name);
		this.start();
	}

	public void run() {
		try {
			//System.out.println(getName() + " waiting to access an ATM machine");
			machines.acquire();
			System.out.println(getName() + " is accessing an ATM machine");
			Thread.sleep(1000);
		//	System.out.println(getName() + " is done using the ATM machine");
			machines.release();
		} catch (InterruptedException ie) {
			System.err.println(ie);
		}
	}
}