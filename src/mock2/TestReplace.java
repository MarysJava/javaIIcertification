package mock2;

public class TestReplace {

	public static void main(String[] args) {
		String str = "A.B.C!";
		System.out.println(str.replaceAll(".", ",").replace("!", "?"));
	}
}
