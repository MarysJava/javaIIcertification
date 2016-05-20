package mock4;

class Widget {
	String data = "data";

	public void doWidgetStuff() {
		System.out.println(data);
	}
}

class GoodWidget extends Widget {
	String data1 = "big data";

	public void doWidgetStuff() {
	}
}

public class TestOverriding {
	public static void main(String[] args) {
		Widget w = new GoodWidget();
		((Widget) w).doWidgetStuff();
		System.out.println(w.data);
		System.out.println(((GoodWidget) w).data);
		//Quando tem sobreposicao de variaveis, ele printa a da classe pai ao chamar com a referencia da classe pai
		// e a da classe filha ao chamar com a referencia da classe filha
		//Apos fazer downcast consegue acessar variaveis especificas da classe filha
		//Variavel da classe pai so enxerga vars da classe pai
	}
}