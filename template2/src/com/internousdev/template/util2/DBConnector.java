package com.internousdev.template.util2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	private static String driverName = "com.mysql.jdbc.Driver";
	private static String uri = "jdbc:mysql://localhost/ecsite2";
	private static String user = "root";
	private static String password = "mysql";

	public Connection getConnection() {

		Connection conn = null;

		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(uri,user,password);

		} catch(ClassNotFoundException e) {
			e.printStackTrace();

		} catch(SQLException e) {
			e.printStackTrace();

		}

		return conn;
	}
}
