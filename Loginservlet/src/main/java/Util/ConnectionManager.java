package Util;

import java.sql.*;

public class ConnectionManager {
	private static String url = "jdbc:mysql://localhost:3306/quanlynhaxe";
	private static String user = "root";
	private static String pwd = "";
	private static ConnectionManager instance = null;

	private Connection con = null;

	private ConnectionManager() {
		 try {
		        Class.forName("com.mysql.cj.jdbc.Driver"); // bắt buộc phải có
		    } catch (ClassNotFoundException e) {
		        e.printStackTrace();
		    }
	}

	public static ConnectionManager getInstance() {
		if (instance == null)
			instance = new ConnectionManager();
		return instance;
	}

	public Connection getConnection() throws SQLException {
		if (con == null) 			
			con = DriverManager.getConnection(url, user, pwd);	
		return con;
	}}
