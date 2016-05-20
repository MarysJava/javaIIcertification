package X.localization;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//Using an example, illustrates the use of "pattern strings" for printing dates
class CustomDatePatterns {
	
//	G Era (BC/AD)
//	y Year      2012    
//	Y Week year 2012
//	M Month (in year)  02 MM ou Fev MMM ou Fevereiro MMMM
//	w Week (in year) 9a semana de 2016
//	W Week (in month) 2a semana de fev
//	D Day (in year) 53 dia do ano 
//	d Day (in month) dia 22 de Fev
//	F Day of week in month 4o segunda-feira de Fevereiro
//	E Day name in week - nome do dia (completo ou abreviado depende da qtde de Es)
//	u Day number of week (value range 0-6) - dia 1 - Segunda-feira (0= Domingo)
	
	
	public static void main(String[] args) {
		// patterns from simple to complex ones
		String[] dateFormats = {
				"dd-MM-Y", /* d is day (in month), M is month, y is year */
				"d '('E')' MMM, YYYY", /*
										 * E is name of the day (in week), Y is
										 * year
										 */
				"w'th week of' YYYY", /* w is the week of the year */
				"EEEE, dd'th' MMMM, YYYY" /* E is day name in the week */
		};
		Date today = new Date();
		System.out.println("Default format for the date is " + DateFormat.getDateInstance().format(today));
		for (String dateFormat : dateFormats) {
			System.out.printf("Date in pattern \"%s\" is %s %n", dateFormat,
					new SimpleDateFormat(dateFormat).format(today));
		}
		
		System.out.println(new SimpleDateFormat("Y").format(today));
	}
}