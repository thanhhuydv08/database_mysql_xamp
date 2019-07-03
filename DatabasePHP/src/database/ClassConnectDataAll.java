package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassConnectDataAll {
	ResultSet resultSet;
	public ResultSet  getInstance(String nameDB, String sqlQuery) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/"+nameDB+"?useUnicode=true&characterEncoding=UTF-8";
		Connection connection = DriverManager.getConnection(url, "root", "");
		Statement statement =connection.createStatement();
		//String sql ="select * from khoa";
		resultSet = statement.executeQuery(sqlQuery);
		return resultSet;
	}
}
