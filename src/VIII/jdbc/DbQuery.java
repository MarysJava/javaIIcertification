package VIII.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


//Program to illustrate how to query a database
class DbQuery {
	public static void main(String[] args) {
		// Get connection, execute query, get the result set
		// and print the entries from the result rest
		try (Connection connection = DbConnector.connectToDb();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM contact")) {
			
			ResultSetMetaData rsm = resultSet.getMetaData();
			
			System.out.println(rsm.getColumnCount() +" "+rsm.getColumnTypeName(4) +" TYPE: "+ resultSet.getType()+" ROW: "+resultSet.getRow());
			System.out.println("ID \tfName \tlName \temail \t\tphoneNo");
			while (resultSet.next()) {
				//Can be used if we don't know the type of result //resultSet.getObject(columnIndex);
				
				System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("firstName") + "\t"
						+ resultSet.getString("lastName") + "\t" + resultSet.getString("email") + "\t"
						+ resultSet.getString("phoneNo"));
			}
			
			System.out.println();
			resultSet.absolute(0); //Move to the position 0 - before the first one that is 1 because next will move to 1
			//Do the same - index of columns begin at 1! IMPORTANT
			//resultSet.beforeFirst(); // do the same of resultSet.absolute(0);
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1)
				+ "\t" + resultSet.getString(2)
				+ "\t" + resultSet.getString(3)
				+ "\t" + resultSet.getString(4)
				+ "\t" + resultSet.getObject(5)); //Can use getObject()
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			System.exit(-1);
		}
	}
}