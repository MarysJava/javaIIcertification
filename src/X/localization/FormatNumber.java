package X.localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

// class to demonstrate how to format or parse numbers for a particular locale
class FormatNumber {
	public static void main(String[] args) {
		long tenMillion = 10_000_000L;
		// first print ten million in German locale
		NumberFormat germanFormat = NumberFormat.getInstance(Locale.GERMANY);
		String localizedTenMillion = germanFormat.format(tenMillion);
		System.out.println("Ten million in German locale is " + localizedTenMillion);
		// now, scan the value ten million given in German locale
		try {
			Number parsedAmount = germanFormat.parse(localizedTenMillion);
			if (tenMillion == parsedAmount.longValue()) {
				System.out.println("Successfully parsed the number for the locale");
			}
		} catch (ParseException pe) {
			System.err.println("Error: Cannot parse the number for the locale");
		}
	}
}