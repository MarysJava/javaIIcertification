package mock2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class EnumTest {
	enum Directions {
		North, East, West, South
	};

	enum Cards {
		Spade, Hearts, Club, Diamond
	};

	public static void main(String[] args) {
		System.out.println("equals: " + Directions.East.equals(Cards.Hearts));
		System.out.println("Ordinals: " + (Directions.East.ordinal() == Cards.Hearts.ordinal()));
		System.out.println(Directions.East.ordinal());
		
		String dateFormat = "d '('EEEE')' MMMM, YYYY";
		// assume today's date is October 28th 2012
		System.out.printf("%s", new SimpleDateFormat(dateFormat).format(new Date()));
		
		Locale l = new Locale(null, null);
		//System.out.println(l); //NullPointerException
	}
}