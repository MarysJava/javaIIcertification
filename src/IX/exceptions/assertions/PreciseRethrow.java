package IX.exceptions.assertions;

class PreciseRethrow {
	public static void main(String[] str) {
		try {
			foo();
		} catch (NumberFormatException ife) {
			System.out.println("Exception: " + ife);
		}
	}

	static private void foo() throws NumberFormatException {
		try {
			int i = Integer.parseInt("ten");
		} catch (Exception e) {
			throw e; // you can throw a type that the try block can throw but no
						// previous catch handles has handled it.
			// the rethrown exception type need not be same as the catch type
			// parameter; it can be a subtype of the catch parameter.
		}
	}
}