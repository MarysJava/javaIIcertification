package mock2.p1;

import static mock2.p1.TestNestedClasses.myClassStatic1;
import mock2.p1.TestNestedClasses.myClass1;

public class TestNestedClasses {

	private static int x;
	private int y;
	
	
	public TestNestedClasses(String a) {
		
	}
	
	//Inner class static
	public final static class myClassStatic1 implements InnerIF {
		
		private static int z=20;
		int t=12;
		
		public static void main(String[] args) {
			x=10;
			
			final  int test = 10;
			
			class c {}
			
			TestNestedClasses tn = new TestNestedClasses("a") {
			};
		}
		
		public static void testStaticMethod() {
		 class E {
				final static int zzz=20;
			}
		}
		
		public void testNonStaticMethod() {
			new TestNestedClasses("a").y=13;
		}
		
		static class D {}
	}
	
	//Inner class	
	 class myClass1 {
		final private static int z=20;
		
	   public myClass1(int z) {
			
		}
		
		int t=12;
		
		
		 class D{}
		//abstract void test1();
		
		final public void test() {
			x=10;
			y=13;
			class c {}
			
			TestNestedClasses tn = new TestNestedClasses("a") {
			};
		}		
	}

	 
	 public  void myMethodTestInner() {
		 final int z=20;
		 int t=12;
		 
		  class MyClassLocalInner extends TestNestedClasses {

			private final static int xx=12;
			 // Como TestNestedClasses só tem um construtor com String tem que definir este e chamar super(String)
			public MyClassLocalInner(String a) {
				super(a); 
				x=15;
				y=15;
				new TestNestedClasses("a").y=15;
				System.out.println(z);
			}
			
			public void mymet() {}
			//abstract private void mymet1();
		 }
	 }
	 
	 public void myMethodTestInnerAnoym() {
		 final int z=20;
		 int t=12;
		 
		    TestNestedClasses tn =   new TestNestedClasses("a") {
		     private final  String gg="gg";
			 public  final void test() {
				 
				 class T {
					 private static final int aa=10;
				 }
				 x=15;
				 y=15;
				 System.out.println(z);
				 
			 }
		 };
	 }
	 
	 
	 //Just to test
	public void myMethodTest1() {
		//Local inner class
	 abstract  class myClass2 {
			final static int z=20;
			int t=12;
			
			abstract void test1();
			
			final public void test() {
				x=10;
				
				
				TestNestedClasses tn = new TestNestedClasses("a") {
					
					public void testM1() {
						x=12;
					}
					
					class c {
						public void testC() {

							TestNestedClasses tn = new TestNestedClasses("a") { };
							
							class D{
							}
						}
						
					}
				};
			}
		}
		
	}
	
	
	private interface InnerIF {
		int xxx=20;
		
		//void test();
		
		static class D{}
		class P{ static int zz=9;  }
	}
	
	public static void main(String[] args) {
		//Criando classe inner estática
		TestNestedClasses.myClassStatic1 m1 =	new TestNestedClasses.myClassStatic1();
		myClassStatic1 m2 =	new myClassStatic1(); //Pode referenciar direto, mesmo arquivo
		System.out.println(TestNestedClasses.myClassStatic1.z); //var estática e private
		System.out.println(m1.z); //var estatica e private
		System.out.println(m1.t); //var nao estática
		
		//Criando inner normal
		TestNestedClasses.myClass1 my2 = new TestNestedClasses("a").new myClass1(20); //Para criar usa-se 2 news e segue construtor da classe inner
		System.out.println(my2.t);
		System.out.println(my2.z);
		System.out.println(TestNestedClasses.myClass1.z); //myClass1 não é estática mas a var final z é, pode acessar assim
		
		//IF
		TestNestedClasses.InnerIF if1 = new TestNestedClasses.myClassStatic1();
		InnerIF if2 = new myClassStatic1();
		
		myClassStatic1 mm = new myClassStatic1();
		//myClassStatic1.z;
		
		myClass1 mmmm = new TestNestedClasses("a"). new myClass1(10); 
		//mmmm.t;
		//mmmm.z;
	}	  
}

