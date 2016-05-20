package X.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello {
	public static void main(String args[]) {
		Locale currentLocale = Locale.getDefault();
		ResourceBundle resBundle = ResourceBundle.getBundle("ResourceBundle", currentLocale);
		//ResourceBundle resBundle = ResourceBundle.getBundle("X.localization.ResourceBundle", currentLocale); 
			// Is possible to pass package like this X.localization
		System.out.printf(resBundle.getString("Greeting"));
	}
}