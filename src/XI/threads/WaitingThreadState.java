package XI.threads;

class WaitingThreadState {
	public static void main(String[] s) {
		Thread t = new InfiniteWaitThread();
		t.start();
		System.out.println(t.getName() + ": I'm in state " + t.getState());
	}
}