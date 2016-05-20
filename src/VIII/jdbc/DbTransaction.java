package VIII.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//To illustrate how to do commit or rollback
class DbTransaction {
	//In this example, neither table got changed since the exception occurred before the commit() method could execute.
	public static void main(String[] args) throws SQLException {
		Connection connection = DbConnector.connectToDb();
		ResultSet resultSet1 = null, resultSet2 = null;
		// we're using explicit finally blocks
		// instead of try-with-resources statement in this code
		try {
			// for commit/rollback we first need to set auto-commit to false
			connection.setAutoCommit(false); //IMPORTANT DON'T FORGET THIS WHEN USE TRANSACTIONS (COMMIT, ROLLBACK, SAVEPOINTS)
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			resultSet1 = statement.executeQuery("SELECT * FROM familyGroup");
			resultSet1.moveToInsertRow();
			resultSet1.updateString("nickName", "Sam Uncle");
			// updating here. . . but this change will be lost if a rollback
			// happens
			resultSet1.insertRow();
			System.out.println("First table updated. . .");
			resultSet2 = statement.executeQuery("SELECT * FROM contact");
			resultSet2.moveToInsertRow();
			resultSet2.updateString("firstName", "Samuel");
			//resultSet2.updateString("firstName", "Samuel");
			resultSet2.updateString("lastName", "Uncle");
			resultSet2.updateString("email", "sam@abc.com");
			resultSet2.updateString("phoneNo", "+119955331100");
			// updating here. . . but this change will be lost of a rollback
			// happens
			resultSet2.insertRow();
			System.out.println("Both tables updated, committing now.");
			// we're committing the changes for both the tables only now
			connection.commit();
		} catch (SQLException e) {
			System.out.println("Something gone wrong, couldn't add a contact in family group");
			// roll back all the changes in the transaction since something has
			// gone wrong
			connection.rollback();
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.close();
			if (resultSet1 != null)
				resultSet1.close();
			if (resultSet2 != null)
				resultSet2.close();
		}
	}
}