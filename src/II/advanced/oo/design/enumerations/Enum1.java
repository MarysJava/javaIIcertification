package II.advanced.oo.design.enumerations;

public enum Enum1 {
	
	TESTE(10),
	TESTE1();
	
	private int teste;
	
	private Enum1(int teste) {
		Object o = new Object();
		this.teste =  teste;
	}
	
	private Enum1(){
		
	}
	
	public int getTeste() {
		return this.teste;
	}
	
	public static void main(String[] args) {
		System.out.println(Enum1.TESTE.name());
		System.out.println(Enum1.values().toString());
		System.out.println(Enum1.valueOf(Enum1.TESTE.toString()));
		System.out.println(Enum1.valueOf(Enum1.class, Enum1.TESTE.toString()));
		System.out.println(Enum1.TESTE1.getTeste());
		
		Enum1 e1 = Enum1.TESTE;
		System.out.println(e1.teste);
		
		for(Enum1 e : Enum1.values()) {
			System.out.println(e.teste);
		}
	}

}
