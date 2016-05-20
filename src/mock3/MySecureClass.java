package mock3;

public class MySecureClass {
	public static synchronized void doALotOfStuff() {
	try {
		System.out.println("Sleep");
		//wait(); //wait não pode ser chamado solto dentro de método estático, teria que ter um objeto pra chamar .wait().
		//wait pode ser chamado em uma var estática CoffeeMachine.lock.wait(); //lock aqui é static
		Thread.sleep(5000); 
	} catch(Exception e) {
		
	}
	
}

	public  static synchronized void doSmallStuff() {
		System.out.println("done");
	}
	
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				MySecureClass.doALotOfStuff();
				notifyAll();
			}
		}.start();
		
		// O lock está implícito no objeto corrente, logo, a Thread dorme e depois printa done (ou vice-versa dependendo de como a JVM fez o schedule)
		// Mas se uma está sleeping (segura o lock) a outra tem que esperar.
		new Thread() {
			public void run() {
				MySecureClass.doSmallStuff();
			}
		}.start();
	}
}