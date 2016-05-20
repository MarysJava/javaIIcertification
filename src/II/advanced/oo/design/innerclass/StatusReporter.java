package II.advanced.oo.design.innerclass;

class StatusReporter {
	// important to note that the argument "color" is declared final
	// otherwise, the local inner class DescriptiveColor will not be able to use
	// it!!
	
	private static int x1;

	static Shape.Color getDesciptiveColor(final Shape.Color color) {
		// local class DescriptiveColor that extends Shape.Color class

		// You can pass only final variables to a local inner class.
		final String s = "Teste";
		String y="";
		String a="";
		x1=0;
		
	
		//Local class (não pode ser static, only abstract or final)
		class DescriptiveColor extends Shape.Color {

			private String myTest1="Test";
			
			public DescriptiveColor() {
			}

			public DescriptiveColor(int x) {
			}

			public String toString() {
				//y="a"; //não compila porque y não é final
				s.concat("Teste2"); //Access final var of local method
				System.out.println(s);
				return "You selected a color with RGB values " + color;
			}
		}

		return new DescriptiveColor();
	}

	static Shape.Color getDesciptiveColor1(final Shape.Color color) {
		// note the use of anonymous inner classes here -- specifically, there
		// is no name for the class and we construct and use the class "on the fly" in the
		// return statement!
		final int b=0;
		
		//Local anonymous class
		return new Shape.Color() { //NO NAME
			public String toString() {
				int a=0;
				System.out.println(b); //Para compilar acesso a variável local, a mesma tem que ser final
				x1=1; //Acessa variável de instancia, pode ser estática ou não, mas, se não for, o método local não pode ser estático, seguindo as regras
				return "You selected a color with RGB values " + color;
			}
		};
	}

	public static void main(String[] args) {
		Shape.Color descriptiveColor = StatusReporter.getDesciptiveColor1(new Shape.Color(0, 0, 0));
		System.out.println(descriptiveColor);
	}
}
