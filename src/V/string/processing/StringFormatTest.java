package V.string.processing;

public class StringFormatTest {
	/*
		//PrintStream printf(String format, Object... args)

		%[flags][width][.precision]datatype_specifier
	  
	Flag “-” specifies left alignment, “^” specifies center alignment, and “0” pads the number with leading zeroes.
	The width specifier indicates the minimum number of characters that will span in the final formatted string.
	If the input data is shorter than the specified width, then it is padded with spaces by default. In case the input data is
	bigger than the specified width, the full data appears in the output string without trimming.

	  	Table 7-6. Commonly Used Data Type Specifiers
		Symbol Description
		%b Boolean
		%c Character
		%d Decimal integer (signed)
		%e Floating point number in scientific format
		%f Floating point numer in decimal format
		%g Floating point numer in decimal or scientific format (depending on the value passed as argument)
		%h Hashcode of the passed argument
		%n Line separator (new line character)
		%o Integer formatted as an octal value
		%s String
		%t Date/time
		%x Integer formatted as an hexadecimal value
	 */
	
	public static void main(String[] args) {
		double tempArea = Math.PI * 10 * 10;
		System.out.println("Cirle area using default formatting with println: " + tempArea);
		System.out.printf("Circle area using format specifier with printf: %.2f", tempArea);
		
		System.out.println();
		
		StringFormatTest.line();
		StringFormatTest.printHeader();
		StringFormatTest.line();
		StringFormatTest.printRow("Demando", 100, 122);
		StringFormatTest.printRow("Mushi", 80, 100);
		StringFormatTest.printRow("Peale", 150, 180);
		StringFormatTest.line();
		
		System.out.println();
		
		int i='a';
		System.out.printf(" %c ",i);
		
	}
	
	static void line() {
		System.out.println("-----------------------------------------------------------------");
	}

	static void printHeader() {
		System.out.printf("%-15s \t %s \t %s \t %s \n", "Player", "Matches", "Goals", "Goals per match");
	}

	static void printRow(String player, int matches, int goals) {
		System.out.printf("%-15s \t %5d \t\t %d \t\t %.1f \n", player, matches, goals, ((float) goals / (float) matches));
		
		//Can use format instead printf, after can print using print or println (String pattern, varargs)
		//String str = String.format("%-15s \t %5d \t\t %d \t\t %.1f \n", player, matches, goals, ((float)goals/(float)matches));
		//System.out.print(str);

	}

}
