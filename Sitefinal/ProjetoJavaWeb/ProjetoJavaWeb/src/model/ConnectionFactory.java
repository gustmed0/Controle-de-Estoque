package model;

import java.sql.*;

public class ConnectionFactory {

	public Connection getConnection() throws SQLException, ClassNotFoundException{
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection conn = null;
        	conn = DriverManager.getConnection("jdbc:mysql://localhost/crud3noite", "root", "");
            return conn;
	}
}