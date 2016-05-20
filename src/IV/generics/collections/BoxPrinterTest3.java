package IV.generics.collections;

class BoxPrinterTest3 {
	public static void main(String[] args) {
		BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(10));
		System.out.println(value1);
		Integer intValue1 = value1.getValue();
		
		BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world");
		System.out.println(value2);
		String intValue2 = value2.getValue();
	}
}