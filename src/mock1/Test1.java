package mock1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
	public static void main(String[] args) {
		int a = 7, b = 10;
		System.out.printf("no:%2$s and %1$s", a, b);
		System.out.printf("\nno:2$s and 1$s", a, b);

		String quote = "abac*abaacc**aabaaccc***";
		String[] words = quote.split("a\\**", 10);
		for (String word : words) {
			System.out.println(word);
		}

		System.out.println();
		
		String str1 = "xxzz";
		String str2 = "xyz";
		String str3 = "yzz";
		Pattern pattern = Pattern.compile("(xx)*y?z{1,}");
		Matcher matcher = pattern.matcher(str1);
		System.out.println(matcher.matches());
		System.out.println(pattern.matcher(str2).matches());
		System.out.println(Pattern.compile("(xx)*y?z{1,}").matcher(str3).matches());

		System.out.println();

		String str = "OCPJP 2013 72727272 88 83 OCPJP7";
		Pattern pattern1 = Pattern.compile("\\b\\w+\\D\\b");
		Matcher matcher1 = pattern1.matcher(str);
		while (matcher1.find()) {
			System.out.println(matcher1.group());
		}

		System.out.println();
		
		String str4 = "Suneetha N.=9876543210, Pratish Patil=9898989898";
		Pattern pattern2 = Pattern.compile("(\\w+)(\\s\\w+)(=)(\\d{10})");
		Matcher matcher2 = pattern2.matcher(str4);
		while (matcher2.find()) {
			System.out.println(matcher2.group());
		}
		String newStr = matcher2.replaceAll("$4:$2,$1");
		System.out.println(newStr);
	}
}
