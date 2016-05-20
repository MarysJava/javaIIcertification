package mock1;

import static mock1.PQR.*;

public class XYZ {
	public static PQR pqr;
	
	public static void main(String[] args) {
		foo();
		pqr.foo();
		
		System.out.println(pqr);  //Se tiver 2 com mesmo nome pega a local, senao pega a do import static
	}
}