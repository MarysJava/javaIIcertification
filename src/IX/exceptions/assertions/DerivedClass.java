package IX.exceptions.assertions;

import java.io.IOException;

public class DerivedClass extends BaseClass {

	@Override
	public void test()  {
		System.out.println("Derived");
	}
	
	public static void main(String[] args) throws IOException {
		BaseClass b = new DerivedClass();
		b.test();
	}
	
}
