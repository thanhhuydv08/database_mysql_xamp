package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Book;
public class ControllerDatabase implements Abstract{
 Connection connection;
 
public ControllerDatabase(String databaseName) throws ClassNotFoundException, SQLException{
	connection=new ConnectDatabaseName().ConnectDatabseCustom(databaseName);
}
public void TimSach(String sql) {
	try {
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		if(resultSet.next()) {
			
		}
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
public int Insert(String sql) {
	// TODO Auto-generated method stub
	int check =0;
	try {
		Statement statement = connection.createStatement();
		check = statement.executeUpdate(sql);
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return check;
}

@Override
public int Update(String sql) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int Delete(String sql) {
	// TODO Auto-generated method stub
	return 0;
}

}
