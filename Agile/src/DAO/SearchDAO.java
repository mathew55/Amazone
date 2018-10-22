package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.SearchProduct;

public enum SearchDAO {
	
	instance;
	
	public Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/amazone", "root", "admin");
			
			if(connection != null) {
				System.out.println("Connected to Amazone OK! ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	
	public void getSearchedParameter(String keyword)
	{
		
		Connection connection = getConnection();
		
		SearchProduct search = null;
		
		try {
			PreparedStatement psmt = connection.prepareStatement("SELECT * FROM products WHERE product_Name=(?)");
			psmt.setString(1, keyword);
			ResultSet res = psmt.executeQuery();
			
			if(res.next()) {
				search = new SearchProduct(res.getString("product_Name"));
						
			}
			else {
				
			}
			
			
			//System.out.println("Added " +A_Name.getFirstName() +" to the database.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}
}




