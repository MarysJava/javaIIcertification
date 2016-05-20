package mock2;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestDateFormat {
	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2012);
		c.set(Calendar.MONTH, 12); //12 = 11 +1 = onde = = Janeiro e 11 = Dezembro, logo 12 = Janeiro do próximo ano, 13 = Fevereiro do próximo ano, etc
		c.set(Calendar.DAY_OF_MONTH, 3);
		System.out.println(df.format(c.getTime()));

		
		//Não entendi ainda o SPLIT Aqui
		String test = "I am preparing for OCPJP";
		String[] tokens = test.split("\\w");
		System.out.println(tokens.length);
		for(String s : tokens) {
			System.out.println(s);
		}

		String quote = "Never lend books-nobody ever returns them!";
		String[] words = quote.split("\\S");
		System.out.println(words.length);
		for (String word : words) {
			//System.out.println(word);
		}
	}
}