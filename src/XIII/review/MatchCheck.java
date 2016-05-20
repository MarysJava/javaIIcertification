package XIII.review;

class MatchCheck {
	public static void main(String[] args) {
		String[] strings = { "Severity 1", "severity 2", "severity3", "severity five" };
		for (String str : strings) {
			// System.out.println(str + " " +
			// str.matches("^severity[\\s+][1-5]"));
			if (!str.matches("^severity[\\s+][1-5]")) {
				System.out.println(str + " does not match");
			}
		}

		// String pattern = "a*b+c{3}";
		// String[] strings1 = { "abc", "abbccc", "aabbcc", "aaabbbccc" };
		// for (String str : strings1) {
		// System.out.print(Pattern.matches(pattern, str) + " ");
		// }
	}
}
