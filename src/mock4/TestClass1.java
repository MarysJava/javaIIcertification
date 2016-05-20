package mock4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Boo {
	int boo = 10;
	
	public Boo(int k) {
		System.out.println("In Boo k = " + k);
		boo = k;
	}
}

class BooBoo extends Boo {
	public BooBoo(){super(10);}
	public BooBoo(int k) {
		super(k);
		System.out.println("In BooBoo k = " + k);
	}
}

class Moo extends BooBoo implements Serializable {
	int moo = 10;
	
	BooBoo booboo;//new BooBoo();

	public Moo() {
		super(5);
		System.out.println("In Moo");
		//booboo.boo=45;
	}
}

public class TestClass1 {
	public static void main(String[] args) throws Exception {
		Moo moo = new Moo();
		FileOutputStream fos = new FileOutputStream("c:\\temp\\moo1.ser");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(moo);
		os.close();
		FileInputStream fis = new FileInputStream("c:\\temp\\moo1.ser");
		ObjectInputStream is = new ObjectInputStream(fis);
		moo = (Moo) is.readObject();
		System.out.println(moo.boo+" " +moo.moo);
		is.close();
	}
	
	//REGRA
	
	//se eu tiver um OBJETO de uma classe que nao implementa serializable vai dar java.io.NotSerializableException:
	//Mas so se tiver um objeto instanciado, so a var de referencia nao tem problema
	//Caso a classe apenas extends outras classes que nao implementam serializable, a classe mais especifica acima dela
	// que nao implementa serializable tem que ter um construtor publico padrao (sem argumentos)
}