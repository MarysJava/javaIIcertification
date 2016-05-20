package mock2;

import java.util.concurrent.atomic.AtomicReference;

abstract class Base1 {
	public abstract Number getValue();
}

public class Deri1 extends Base1 {
	public java.util.concurrent.atomic.AtomicInteger getValue() {
		return new java.util.concurrent.atomic.AtomicInteger(10);
	}
	
	public static void main(String[] args) {
		Deri1 b = new Deri1();
		System.out.println(b.getValue());
		
		AtomicReference<String> test;
	} 
}