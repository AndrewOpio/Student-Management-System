package sms;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseConnection implements operationsInterface{
	private Connection con;
	private Statement stmt;
	
	public databaseConnection() throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrrs","root","");
			stmt = con.createStatement();
		} catch(SQLException e) {
			
		}
	}
	
	
	//Fetching data from the database
	public ResultSet getData(String query) {
		ResultSet res = null;
		try {
			res = stmt.executeQuery(query);
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}



	//Insert data into the database
	public void insertData(String query) {
		try {
			ResultSet res = stmt.executeQuery(query);
			con.close();
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//Searching for data in the database
	public ResultSet searchData(String query) {
		ResultSet res = null;
		try {
			res = stmt.executeQuery(query);
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
}

