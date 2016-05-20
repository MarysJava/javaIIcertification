package mock2.p1;

import mock2.p1.Phone.State;

class Phone {
	public enum State {
		ONCALL, IDLE, WAITING
	}
}

public abstract class Test {
	public static void main(String args[]) throws InterruptedException {
		Phone.State state = Phone.State.ONCALL;
		//State state1 = Phone.ONCALL;
		State state2 = State.ONCALL; // SE IMPORTAR Phone.State posso usar direto State.ONCALL
		//State state3 = ONCALL;
	}
	
	final public void myMethod1() {};
	
}