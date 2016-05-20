package XI.threads;

class ThreadStatesEnumeration {
	public static void main(String[] s) {
		for (Thread.State state : Thread.State.values()) {
			System.out.println(state);
		}
	}
}