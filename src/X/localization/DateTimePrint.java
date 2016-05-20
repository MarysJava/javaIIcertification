package X.localization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

class DateTimePrint {
	public static void main(String[] args) {
		// the default constructor for the Date gets the current time and date
		Date today = new Date();
		Locale[] locales = { Locale.CANADA, Locale.FRANCE, Locale.GERMANY, Locale.ITALY , Locale.getDefault()};
		// print the header first
		System.out.printf("%5s \t %10s \t %10s \t %10s %n", "Locale", "Date", "Time", "Date with Time");
		// print the date, time, and date & time for each locale
		for (Locale locale : locales) {
			// DateFormat.SHORT is for giving the date or
			// time details in compact format
			DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, locale);
			DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.SHORT, locale);
			// now, for Date & Time, change the styles to MEDIUM and FULL
			DateFormat dateTimeFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, locale);
			System.out.printf("%5s \t %10s \t %10s \t %20s %n", locale, dateFormat.format(today),
					timeFormat.format(today), dateTimeFormat.format(today));
		}
	}
}