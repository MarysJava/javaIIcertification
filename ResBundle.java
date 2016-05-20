
import java.util.ListResourceBundle;

public class ResBundle extends ListResourceBundle {
	public Object[][] getContents() {
		return contents;
	}

	static final Object[][] contents = { { "MovieName", "Avatar" }, { "GrossRevenue", (Long) 2782275172L }, // in
																											// US
																											// dollars
			{ "Year", (Integer) 2009 } };
}