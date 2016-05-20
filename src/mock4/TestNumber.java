package mock4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class TestNumber {

	int i1, i2, i3; //Tanto faz ser estatico ou nao
	

	public static void main(String[] args) {
			new TestNumber().teste();
			
			try {
				PrintWriter pw = new PrintWriter(new FileWriter("x"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //
	}
	
	public void teste() {
		try {
			new TestNumber().test(i1 = 1, oops(i2 = 2), i3 = 3);
			//Seta o valor de i1 para 1, seta o valor de i2 para 2 mas, ai da excecao e o 3 nao chega a executar
			// e fica com valor padrao que e 0
			//Ao passar um primitivo pra um metodo nao muda o valor dele, mas neste caso estou fazendo
			// um set explicito
		} catch (Exception e) {
			System.out.println(i1 + " " + i2 + " " + i3);
		}
	}

	int oops(int i) throws Exception {
		i =15; //Neste caso i=15 nao tem efeito sobre o valor original de i porque i eh uma var local que nao
		//afeta o valor original passado
		//i2=15; ai sim alteraria o valor de i2 porque estou alterando o atributo da classe
		throw new Exception("oops");
	}

	 int test(int a, int b, int c) {
		return a + b + c;
	}
}