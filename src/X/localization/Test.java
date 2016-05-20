package X.localization;

import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		//Creating Locales
		Locale locale1 = new Locale("it", "", "");
		Locale locale2 = Locale.forLanguageTag("it");
		Locale locale3 = new Locale.Builder().setLanguageTag("it").build();
		Locale locale4 = Locale.ITALIAN;
		
		System.out.printf("%-10s %-10s %-10s %-10s %n",locale1, locale2, locale3, locale4);
		System.out.println(Locale.GERMANY.getDisplayCountry(Locale.GERMANY));
		System.out.println(Locale.GERMANY.getDisplayCountry(Locale.ENGLISH));
	}
}
