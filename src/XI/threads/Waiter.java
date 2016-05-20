package XI.threads;

//The Waiter runs as an independent thread
//It interacts with the CoffeeMachine to wait for a coffee
//and deliver the coffee once ready and request the coffee machine
//for the next one, and this activity keeps going on forever . . .
class Waiter extends Thread {
	synchronized public static void getCoffee() {
		synchronized (CoffeeMachine.lock) {
			//Posso ter métodos synchronized static
			//Posso ter sycnhronized blocks dentro de métodos estáticos, no entando não pode ter lock no this
			//porque métodos estáticos não acessam this
			//O lock é em um objeto, e se duas threads vão conversar/trabalhar juntas ou uma espera a outra o lock tem que ser
			// no MESMO objeto!
			if (CoffeeMachine.coffeeMade == null) {
				try {
					// wait till the CoffeeMachine says (notifies) that
					// coffee is ready
					System.out.println("Waiter: Will get orders till coffee machine notifies me ");
					CoffeeMachine.lock.wait(); //Esta thread espera outra thread executar se condição
				} catch (InterruptedException ie) {
					// its okay to ignore this exception
					// since we're not using thread interrupt mechanism
					ie.printStackTrace();
				}
			}
			System.out.println("Waiter: Delivering " + CoffeeMachine.coffeeMade);
			CoffeeMachine.coffeeMade = null; 
			// ask (notify) the coffee machine to prepare the next coffee
			CoffeeMachine.lock.notifyAll(); //Notifica outras threads
			System.out.println("Waiter: Notifying coffee machine to make another one");
		}
	}

	public void run() {
		// keep going till the user presses ctrl-C and terminates the program
		while (true) {
			getCoffee();
		}
	}
}