package mock2;

class Base {
}

class DeriOne extends Deri1 {
}

class DeriTwo extends Deri1 {
}

class ArrayStore {
	public static void main(String[] args) {
		
		Object x[] = new String[3];
	    x[0] = new Integer(0);
		//Mesmo problema do raw type... se for primitivo ja da compile error
	    
	    //Object y[] =  new int[2]; //Compile error
	    
	    
		Deri1[] baseArr = new DeriOne[3];
		baseArr[0] = new DeriOne();
		baseArr[2] = new DeriTwo(); //So da erro porque DeriTwo e do tipo Base, e so da pra saber em tempo de execucao, polimorfismo
		//baseArr[2] = new String(); //Como String nao extends base = compile error
		System.out.println(baseArr.length);
	}
}