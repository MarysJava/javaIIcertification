package mock2.p1;

public interface IF1 {

	 final static class Inner{
		
		static int x=10;
		//abstract void test();
		
		static void test1(){
		}
		
		static class Inner1 { }
	}
	
	 interface InnerIF{
		static int x=10;
		
		void test();
		
		static class D{
			static int zz=9;
			private  void Test() {
				System.out.println("Oi");
				class E {}
			}
			
		}
		class P{ 
			static int zz=9; 
			private  void Test() {
				System.out.println("Oi");
			  class E { 
					static final int zz=9;  
					}
			}			
		}
	}
	
	//Implicit static?
}
