package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTestMain {
	public static void main(String[] args) {
		String userName = "root";
		String password = "root";
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String connectionURL = "jdbc:mysql://localhost:3306/citibankdb";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionURL, userName, password);
			if (connection != null) {
				System.out.println("Connection success");
			} else {
				System.out.println("Connection failed!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
