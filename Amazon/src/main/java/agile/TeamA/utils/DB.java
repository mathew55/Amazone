package agile.TeamA.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
	public Connection initDB() {
	Connection con;
	//String driver="com.mysql.cj.jdbc.Driver";
	//String url="jdbc:mysql://localhost:3307/amamzone?useSSL=false&serverTimezone=UTC";
	//String user="root";
	//String password="admin";	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "admin");
		properties.setProperty("useLL", "false");
		properties.setProperty("autoReconnect", "true");
		String url = "jdbc:mysql://localhost:3307/amazone";
		con = DriverManager.getConnection(url, properties);
		if(!con.isClosed()) {
			System.err.println("Successful connecting to database");	
		}
		return con;
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.err.println("class not found!");
		e.printStackTrace();
		return null;
	}	catch(SQLException sq){
		System.err.println("connection error!");
		sq.printStackTrace();
		return null;
	}
	
	}
}
