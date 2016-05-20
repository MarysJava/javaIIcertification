package V.string.processing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	
	/*
	 *  ^expr Matches expr at beginning of line.
		expr$ Matches expr at end of line. 
		. Matches any single character (except the newline character).
		[xyz] Matches either x, y, or z.
		[p-z] Specifies a range. Matches any character from p to z.
		[p-z1-9] Matches either any character from p to z or any digit from 1 to 9 (remember, it won’t match p1).
		[^p-z] ‘^’ as first character inside a bracket negates the pattern; it matches any character except
characters p to z.
		Xy Matches x followed by y.
		x | y Matches either x or y.
		
		You can use the symbols given in Table 7-3 and specify regex. For example, you can write "[0–9]" to match all
digit characters or "[\t\r\f\n]" to match all whitespaces. Also, you can also use certain predefined metasymbols to
ease the regex specification. For instance, you can specify "\d" instead of "[0–9]" to match digits, or "\s" instead of
"[\t\r\f\n]" to match all whitespaces. Table 7-4 summarizes a list of commonly used metasymbols.

	\d Matches digits (equivalent to [0–9]).
	\D Matches non-digits.
	\w Matches word characters.
	\W Matches non-word characters.
	\s Matches whitespaces (equivalent to [\t\r\f\n]).
	\S Matches non-whitespaces.
	\b Matches word boundary when outside bracket. Matches backslash when inside bracket.
	\B Matches non-word boundary.
	\A Matches beginning of string.
	\Z Matches end of string.
	
	Okay, so far so good. But what if you want to specify a regex when the match involves an occurrence count of
characters? Well, for such situations you can use quantifier symbols, provided in Table 7-5.

	expr? Matches 0 or 1 occurrence of expr (equivalent to expr{0,1}).
	expr* Matches 0 or more occurrences of expr (equivalent to expr{0,}).
	expr+ Matches 1 or more occurrences of expr (equivalent to expr{1,}).
	expr{x} Matches x occurrences of expr.
	expr{x, y} Matches between x and y occurrences of expr.
	expr{x,} Matches x or more occurrences of expr.

The Pattern and Matcher classes are optimized for performance while methods like split() in String
are not.
	 */
	
	public static void main(String[] args) {
		String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone, Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post office, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";
		
		Pattern pattern = Pattern.compile("\\w+"); //“\\” is interpreted as a single backslash
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		System.out.println();
		
		pattern = Pattern.compile("\\b\\d{5}\\b");
		matcher = pattern.matcher(str);
		while(matcher.find()) {
		System.out.println(matcher.group());
		}
		
		System.out.println();
		
		pattern = Pattern.compile("\\w+@\\w+\\.com");
		matcher = pattern.matcher(str);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		System.out.println();
		
		pattern = Pattern.compile("(\\b)(\\d{3})(\\d{7})(\\b)");
		matcher = pattern.matcher(str);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		String newStr = matcher.replaceAll("$1$2-$3$4");
		System.out.println(newStr);
		
		System.out.println();
		
		String ipStr1 = "255.245.188.123"; // valid IP address
		String ipStr2 = "255.245.188.273"; // invalid IP address - 273 is greater than 255
		validateIP(ipStr1);
		validateIP(ipStr2);
		
		System.out.println();

		str="aa 255.245.188.123 11 255.245.188.273 aa";
		pattern = Pattern.compile("\\b((25[0–5]|2[0–4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0–5]|2[0–4]\\d|[01]?\\d\\d?)\\b");
		//? makes the statement optional
		matcher = pattern.matcher(str);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}		
	}	
	
	static void validateIP(String ipStr) {
		String regex = "\\b((25[0–5]|2[0–4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0–5]|2[0–4]\\d|[01]?\\d\\d?)\\b";
		System.out.println(ipStr + " is valid? " + Pattern.matches(regex, ipStr));
	}
}
