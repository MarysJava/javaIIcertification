package mock2;

class Test {
	Integer I;
	int i;

	public Test(int i) {
		System.out.println(this.i+" "+I+" "+i);
		// Note que nao assigno I=i 
		// Integer I e inicializado por padrao com null (Wrapper class)
		this.i = I + i; // Corresponde a this.i = null + 1 - vai estourar NullPointerException
		System.out.println(this.i);
	}

	public static void main(String args[]) {
		Integer I = new Integer(1);
		Test test = new Test(I);
	}
}