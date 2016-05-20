package mock2;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

class SortedOrder {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("S");
		set.add("R");
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			// set.remove(iter.next());
			iter.next();
			iter.remove();
			// System.out.print(iter.next() + " ");
		}

		Formatter formatter = new Formatter();
		Calendar calendar = Calendar.getInstance(Locale.US);
		calendar.set(/* year = */ 2012, /* month = */ Calendar.FEBRUARY,
				/* date = */ 1);
		formatter.format("%tY/%<tB/%<td", calendar); // %t = to format date/time, diferente de \t de tabulação
		System.out.println(formatter);
		formatter = new Formatter();
		// The same of:
		formatter.format("%tY/%tB/%td", calendar, calendar, calendar);
		System.out.println(formatter);
	}
}