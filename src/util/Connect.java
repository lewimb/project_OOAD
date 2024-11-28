package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	
	private final String USERNAME = "root";
	private final String PASSWORD = "";
	private final String DATABASE = "calouseif";
	private final String HOST = "localhost:3306";
	private final String CONNECTION = String.format("jdbc:mysql://%s/%s", HOST, DATABASE);

	public ResultSet rs;
	public ResultSetMetaData rm;
	
	private Connection con;
	private Statement st;
	private static Connect connect;
	
	
	
	private Connect(){
		try {
			Class.forName("com.mysql.jdbc.driver");
			con = DriverManager.getConnection(CONNECTION,USERNAME,PASSWORD);
			st = con.createStatement();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static Connect getInstance() {
		if(connect == null) {
			return new Connect();
		}
		return connect;
		
	}
	
	public Connection getConnection() {
		return con;
	}
	
	
	public ResultSet execQuery(String query) {
		try {
			rs = st.executeQuery(query);
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
		
		return rs;
		
	}

}
