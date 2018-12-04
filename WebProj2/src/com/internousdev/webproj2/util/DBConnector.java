package com.internousdev.webproj2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class DBConnector
 */
@WebServlet("/DBConnector")
public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/testdb_1";
	private static String user = "root";
	private static String password = "mysql";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connection getConnection() {
    	Connection con = null;
    	try {
    		Class.forName(driverName);
    		con = DriverManager.getConnection(url,user,password);
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}

    	return con;
    }
}
