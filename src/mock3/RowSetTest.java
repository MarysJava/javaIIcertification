package mock3;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetTest {

	public static void main(String[] args) {
		RowSetFactory rowSetFactory;
		try {
			rowSetFactory = RowSetProvider.newFactory();
			// create a JDBC rowset from the factory
			JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
