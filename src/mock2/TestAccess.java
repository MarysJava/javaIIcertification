package mock2;

import mock2.p1.TestNestedClasses;
import mock2.p1.TestNestedClasses.myClassStatic1;

public class TestAccess {
		public static void main(String[] args) {
			//Criando classe inner estática
			TestNestedClasses.myClassStatic1 m1 =	new TestNestedClasses.myClassStatic1();
			//Só funciona se myClassStatic1 = public ou seguindo as regras dos modificadores de acesso.
			
			myClassStatic1 m2 =	new myClassStatic1(); //Não pode referenciar direto, outro arquivo, a menos que use o import como foi feito
			
			//Criando inner normal
			//TestNestedClasses.myClass1 my2 = new TestNestedClasses("a").new myClass1(20); //Para criar usa-se 2 news e segue construtor da classe inner
			//System.out.println(my2.t);
			
			myClassStatic1 mm = new myClassStatic1();
			//myClassStatic1.z;
			
			//myClass1 mmmm = new TestNestedClasses("a"). new myClass1(10); 
			//mmmm.t;
			//mmmm.z;
		}	
}
