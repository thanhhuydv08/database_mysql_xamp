package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassConnectDataAll {

	public void getInstance(String nameDB, String table ) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/qlsv?useUnicode=true&characterEncoding=UTF-8";
		Connection connection = DriverManager.getConnection(url, "root", "");
		Statement statement =connection.createStatement();
		String sql ="select * from khoa";
		ResultSet resultSet = statement.executeQuery(sql);
	}
}
