package mock1;

public class TestInteger {

	
	public static void main(String[] args) {
		int i = 012;
		//int i1 = 10.0f;
		//int i2 = 10l;
		//int i3 = 10.0;
		
		if(i == (new Double(10.0))) //Pode comparar int com float, double com int, etc
			System.out.println("true");
		
		StringBuffer strBuffer = new StringBuffer("This, that, etc.!");
		System.out.println(strBuffer.replace(12, 15, "etcetera"));
		
		Boolean b = null;
		//System.out.println(b ? true : false); //throw NullPointerException porque Boolean b teria a "propriedade" true/false
		
		System.out.printf(null); //throw NullPointerException
	}
	
}
