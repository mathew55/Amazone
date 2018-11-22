package dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.Part;

import model.AddProduct;


public enum AddProductdao {
	instance;
	// Setting up the Database and Checking if the database connection is OK
	
public Connection getConnection() {
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/amazone", "root", "admin");
			
			//If the connection is not null it gets the connection and link to mysql database
			if(connection != null) {
				
				System.out.println("connected to amazoneDb ok!");
			}
			
		}
		// Else if the connection is null then it throws a exception
		catch(Exception e){
			
			e.printStackTrace();
		}
		return connection;
		
	}

// This is a method called to save a product to the database

public void saveProduct (AddProduct product) {
	
	// getting the connection to the database
	Connection connection = getConnection();
	
	
	try {
		
		PreparedStatement psmt2 = connection.prepareStatement("INSERT INTO PRODUCTS (product_Name, product_Manufacturer, product_Price, product_Description, product_Quantity_Available, product_Image) VALUES(?,?,?,?,?,?)");
		
		psmt2.setString(1, product.getProductName());
		psmt2.setString(2, product.getProductManufacturer());
		psmt2.setDouble(3, product.getProductPrice());
		psmt2.setString(4, product.getProductDescription());
		psmt2.setInt(5, product.getProductQuantity());
		
		if (product.getInputFile() != null) {
            // fetches input stream of the upload file for the blob column
			psmt2.setString(6, product.getInputFile().getContentType());
        }
			
		psmt2.executeUpdate();
		
		System.out.println("Added" + product.getProductName() + "to the database.");
		
	}catch(SQLException e) {
		
		e.printStackTrace();
	}
}

public AddProduct CheckProductName(String productname) {
	
	Connection connection = getConnection();
	AddProduct product = null;
	
	try {
		PreparedStatement psmt = connection.prepareStatement("SELECT product_Name FROM PRODUCTS WHERE product_Name = ?");
		psmt.setString(1, productname);
		ResultSet res = psmt.executeQuery();
		
		if(res.next()) {
			product = new AddProduct(res.getString("productName, productDescription, productPrice, productQuantity, productManufacturer"));
			
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

