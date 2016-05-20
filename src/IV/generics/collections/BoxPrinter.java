package IV.generics.collections;

//This program shows container implementation using generics
class BoxPrinter<T> {
	private T val;

	public BoxPrinter(T arg) {
		val = arg;
	}

	public String toString() {
		return "[" + val + "]";
	}
	
	public T getValue() {
		return val;
	}
}