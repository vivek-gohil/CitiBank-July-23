package com.citibank.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginRepository {
	private String userName = "root";
	private String password = "root";
	private String url = "jdbc:mysql://localhost:3306/citibankdb";
	private String query;
	private int loginAttemptCounter = 0;

	// connect database
	private Connection connection;
	// write-store and execute query
	private PreparedStatement preparedStatement;
	// store data from table
	private ResultSet resultSet;

	public String validateLoginDetails(String logiId, String password) {

		query = "select user_name from login_details where login_id = ? and password = ?";
		try {
			connection = DriverManager.getConnection(url, userName, this.password);
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, logiId);
			preparedStatement.setString(2, password);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next() && loginAttemptCounter < 3) {
				loginAttemptCounter = 0;
				String userName = resultSet.getString("user_name");
				return userName;
			} else {
				loginAttemptCounter++;
				if (loginAttemptCounter == 3) {
					return "max";
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
