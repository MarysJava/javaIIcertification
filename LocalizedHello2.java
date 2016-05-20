import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello2 {
	public static void printMovieDetails(ResourceBundle resBundle) {
		String movieName = resBundle.getString("MovieName");
		Long revenue = (Long) (resBundle.getObject("GrossRevenue"));
		Integer year = (Integer) resBundle.getObject("Year");
		System.out.println("Movie " + movieName + "(" + year + ")" + " grossed " + revenue);
	}

	public static void main(String args[]) {
		// print the largest box-office hit movie for default (US) locale
		Locale locale = Locale.getDefault();
		printMovieDetails(ResourceBundle.getBundle("ResBundle", locale));
		// print the largest box-office hit movie for Italian locale
		locale = new Locale("it", "IT", "");
		printMovieDetails(ResourceBundle.getBundle("ResBundle", locale));
	}
}