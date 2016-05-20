package mock2;

class Overloaded {
	public static void aMethod(long val1, int val2) {
		System.out.println("long, int");
	}

	public static void aMethod(int val1, long val2) {
		System.out.println("int, long");
	}

	public static void main(String[] args) {
		// aMethod(9, 10); //Neste caso nao compila porque tem long, int, int, long e 9 e 10 podem encaixar em qualquer um
		// Se fosse apenas long ou int, encaixaria no int
		// O compilador busca o match mais especifico, como no caso de passar null pra Object e double [], neste caso double [] e mais especifico que Object
	}
}