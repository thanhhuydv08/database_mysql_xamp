package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDatabaseName {
	public Connection  ConnectDatabseCustom(String nameDB) throws ClassNotFoundException, SQLException {	
		Class.forName("com.mysql.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/"+nameDB+"?useUnicode=true&characterEncoding=UTF-8";
		Connection connection = DriverManager.getConnection(url, "root", "");
		//String sql ="select * from khoa";	
		return connection;
	}
}
//Statement statement =connection.createStatement();
//resultSet = statement.executeQuery(sqlQuery);