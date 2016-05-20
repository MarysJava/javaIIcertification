package IX.exceptions.assertions;

public class FinallyTest {
	
	public static void main(String[] args) {
		System.out.println(testFinally());
	}
	
	public static String testFinally() {
		String a="Hi";
		try {
			System.out.println(a.length());
			return "try";
		} catch(NullPointerException npe) {
			a="HiError";
			npe.printStackTrace();
			return "Error";
		} finally {
			return a; //Always return finally - has this warning about finally does not complete normally
		}
	}
}
