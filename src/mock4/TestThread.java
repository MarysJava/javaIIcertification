package mock4;

import java.sql.Connection;
import java.sql.Statement;

class AA extends Thread {
	synchronized public void run() {
		System.out.println("Starting loop");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
		while (true) {
		}
	}
}

public class TestThread {
	public static void main(String args[]) throws Exception {
		Connection c = null;
		//try(Statement stmt = c.createStatement();)
		
		AA a = new AA();
		a.start();
		Thread.sleep(1000);
		a.interrupt(); //A thread acima nunca para de executar por causa do loop infinito, porem toma uma InterruptedException
		//se chama wait
		//lembrando que wait / notify so pode ser chamado dentro de coisas sincronizadas (tem o lock)
		// e que wait lanca InterruptedException mas notify nao
	}
}