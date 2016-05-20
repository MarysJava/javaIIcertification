package II.advanced.oo.design.enumerations;

public class TestEnum1 {

	public static void main(String[] args) {
		System.out.println(Enum1.TESTE.name());
		System.out.println(Enum1.values().toString());
		System.out.println(Enum1.valueOf(Enum1.TESTE.toString()));
		System.out.println(Enum1.valueOf(Enum1.class, Enum1.TESTE.toString()));
		System.out.println(Enum1.TESTE1.getTeste());

		Enum1 e1 = Enum1.TESTE;
		System.out.println(e1.getTeste());

		for (Enum1 e : Enum1.values()) {
			System.out.println(e.getTeste());
		}
	}

}
