package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Product;

public enum ProductDAO {

	instance;


	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazone", "root", "");
			
			if(connection != null) {
				System.out.println("Connected to DemoDB OK! ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	

	public Product checkFirstName(int pid) {
		Connection connection = getConnection();
		
		int product_ID;
		StringBuilder product_Name = new StringBuilder("");
		StringBuilder product_Manufacturer = new StringBuilder("");
		double product_Price=0;
		int product_Quantity=0;
		int flag = 0;
		try {
			PreparedStatement psmt = connection
					.prepareStatement("SELECT * FROM products WHERE product_ID = ?");
			psmt.setInt(1, pid);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				product_Name.append(rs.getString("product_Name"));
				product_ID = pid;
				product_Manufacturer.append(rs.getString("product_Manufacturer"));
				product_Price = rs.getDouble("product_Price");
				product_Quantity = rs.getInt("product_Quantity_Available");
				flag =0 ;
			}
			else {
				flag=1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		Product product = new Product(pid,product_Name.toString(),product_Manufacturer.toString(),product_Price,product_Quantity,flag);

		return product;

	}
	
}
