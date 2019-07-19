/**
 * 
 */
package com.queryform.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.queryform.interfaces.QueryFormInterface;
import com.queryform.model.QueryForm;

/**
 * @author KVBhaskar
 *
 */
public class QueryFormDAO implements QueryFormInterface {

	@Override
	public int insertQueryForm(QueryForm queryForm) throws ClassNotFoundException {

		final String INSERT_QUERY_FORM = "INSERT INTO queryform"
				+ "  (first_name, last_name, emailId, contactNumber, currentProfession, reasonOfInterest, whyFranchise, haveYouExperienced) VALUES "
				+ " (?, ?, ?, ?, ?, ?, ?, ?);";

		int result = 0;
		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/query_form?useSSL=false",
				"root", "mysql12345");
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY_FORM)) {
			preparedStatement.setString(1, queryForm.getFirstName());
			preparedStatement.setString(2, queryForm.getLastName());
			preparedStatement.setString(3, queryForm.getEmailId());
			preparedStatement.setString(4, queryForm.getContactNumber());
			preparedStatement.setString(5, queryForm.getCurrentProfession());
			preparedStatement.setString(6, queryForm.getReasonOfInterest());
			preparedStatement.setString(7, queryForm.getWhyFranchise());
			preparedStatement.setString(8, queryForm.getHaveYouExperienced());

			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			printSQLException(e);
		}
		return result;
	}

	@Override
	public int updateQueryForm(QueryForm queryForm) {
		// DAO logic
		System.out.println("Update logic");

		return 0;
	}

	@Override
	public List<QueryForm> fetchQueryForm(QueryForm queryForm) {
		// DAO logic
		System.out.println("select query logic");
		return null;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
