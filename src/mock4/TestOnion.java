package mock4;

class Onion {

	private String data = "skin";

	public class Layer extends Onion {
		String data = "thegoodpart"; //Se nao tiver data aqui, chama a da Outer class, ou se chamar com super diretamente

		public String getData() {
			return data;
		}
		//Se a inner class nao tem o método ele chama o da outer, no caso aqui vai ficar fazendo chamadas recursivas
		//e dar stack overflow.
	}

	public String getData() {
		return new Layer().getData();
	}
}

public class TestOnion {
	// So consegue referenciar direto na mesma classe, caso contrário Onion.Layer
	//Se for private outra classe nao acessa, nao vai compilar - mesma regra dos modificadores de acesso
	public static void main(String[] args) {
		Onion o = new Onion();
		Onion.Layer oo = o.new Layer();
		System.out.println(o.getData());
	}
}