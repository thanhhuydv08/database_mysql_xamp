package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.text.MaskFormatter;

public class ConnectDB {
static String makh,tenkh;
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url ="jdbc:mysql://localhost:3306/qlsv?useUnicode=true&characterEncoding=UTF-8";
			Connection connection = DriverManager.getConnection(url, "root", "");
			Statement statement =connection.createStatement();
			String sql ="select * from khoa";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				makh=resultSet.getString("makh");
				tenkh=resultSet.getString("tenkh");
				System.out.println(makh +"-"+tenkh);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
