package X.localization;

import java.util.Currency;
import java.util.Locale;

//Get the currency details of the default locale (en_US locale)
class CurrencyDetails {
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		Currency currencyInstance = Currency.getInstance(locale);
		System.out.println(" The currency code for locale " + locale + " is: " + currencyInstance.getCurrencyCode()
				+ " \n The currency symbol is " + currencyInstance.getSymbol() + " \n The currency name is "
				+ currencyInstance.getDisplayName() + " "+currencyInstance.getNumericCode());
	}
}