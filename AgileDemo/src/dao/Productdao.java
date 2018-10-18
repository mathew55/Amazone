package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Name;
import model.Product;;


public enum Productdao {
	instance;
	// Checks if the database connection is OK
public Connection getConnection() {
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/DemoDB", "root", "admin");
			if(connection != null) {
				
				System.out.println("connected to demoDb ok!");
			}
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		return connection;
		
	}



public void saveProduct (Product product) {
	
	Connection connection = getConnection();
	
	try {
		
	//	PreparedStatement psmt1 = connection.prepareStatement("SELECT product_Name FROM PRODUCTS WHERE product_Name = ?");
		PreparedStatement psmt2 = connection.prepareStatement("INSERT INTO PRODUCTS (product_Name, product_Description, product_Price, product_Quantity, product_Manufacturer) VALUES(?,?,?,?,?)");
		
		psmt2.setInt(1, product.getProductId());
		psmt2.setString(2, product.getProductName());
		psmt2.setString(3, product.getProductManufacturer());
		psmt2.setFloat(4, product.getProductPrice());
		psmt2.setString(5, product.getProductDescription());
		psmt2.setInt(6, product.getProductQuantity());
		
		psmt2.executeUpdate();
		
		System.out.println("Added" + product.getProductName() + "to the database.");
		
	}catch(SQLException e) {
		
		e.printStackTrace();
	}
}

public Product CheckProductName(String productname) {
	
	Connection connection = getConnection();
	Product product = null;
	
	try {
		PreparedStatement psmt = connection.prepareStatement("SELECT product_Name FROM PRODUCTS WHERE product_Name = ?");
		psmt.setString(2, productname);
		ResultSet res = psmt.executeQuery();
		
		if(res.next()) {
			product = new Product(res.getString("productName"));
			System.out.println("name" + productname + "is in the data base.");
		}
		
		else {
			System.out.println("name" + productname + "is not in the data base.");
		}
		
	}catch(SQLException e) {
		
		e.printStackTrace();
	}
	return product;
}


}

