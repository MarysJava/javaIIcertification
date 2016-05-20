package XI.threads;

//This class instantiates two threads - CoffeeMachine and Waiter threads
//and these two threads interact with each other through wait/notify
//till you terminate the application explicitly by pressing Ctrl-C
public class CoffeeShop {
	public static void main(String[] s) {
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		Waiter waiter = new Waiter();
		coffeeMachine.start();
		waiter.start();
	}
}