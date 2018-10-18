package DAO;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Name;

public enum NameDAO {
	/*
	 * product_Name varchar(50) 
product_Manufacturer varchar(20) 
product_Price decimal(7,2) 
product_Description varchar(1000) 
product_Quantity_Available int(11)
	 */
	instance;

	public class Product{
			public int product_ID;
			public String product_Name = new String();
			public String product_Manufacturer = new String();
			public double product_Price;
			public int product_Quantity;
			public Product(int pid,String product_Name,String product_Manufacturer,double product_Price,int product_Quantity)
			{
				this.product_ID = pid;
				this.product_Name = product_Name;
				this.product_Manufacturer = product_Manufacturer;
				this.product_Price=product_Price;
				this.product_Quantity=product_Quantity;
			}
			public Product() {
			
			}
		}
	public Connection getConnection() {
		Connection connection = null;
//		Product product = new Product(pid);
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
	
//	public void saveFirstName(Name A_Name) {
//	public void saveFirstName(int pid) {
//		Connection connection = getConnection();
//		
//		try {
//			PreparedStatement psmt = connection
//					.prepareStatement("INSERT INTO mynames (firstname) VALUE (?)");
////			psmt.setString(1,  A_Name.getFirstName());
//			psmt.executeUpdate();
//			
////			System.out.println("Added " +A_Name.getFirstName() +" to the database.");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
/*	public class Product{
		int product_ID;
		StringBuilder product_Name = new StringBuilder("");
		StringBuilder product_Manufacturer = new StringBuilder("");
		double product_Price;
		int product_Quantity;
		public Product()
		{
			
		}
	}*/
	//public Name checkFirstName(String name) {
	public Product checkFirstName(int pid) {
		Connection connection = getConnection();
		
		int product_ID;
		StringBuilder product_Name = new StringBuilder("");
		StringBuilder product_Manufacturer = new StringBuilder("");
		double product_Price=0;
		int product_Quantity=0;
//		Name A_Name = null;
//		Product product = new Product(pid);
		try {
			PreparedStatement psmt = connection
					.prepareStatement("SELECT * FROM products WHERE product_ID = ?");
			psmt.setInt(1, pid);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
		//		A_Name = new Name(rs.getString("firstname"));
		//		Product product = new Product();
				product_Name.append(rs.getString("product_Name"));
				product_ID = pid;
				product_Manufacturer.append(rs.getString("product_Manufacturer"));
				product_Price = rs.getDouble("product_Price");
				product_Quantity = rs.getInt("product_Quantity_Available");
				//Product product = new Product();
			}
			else {
				System.out.println("name " +pid+ " is not in the data base");
			}
//			Product product = new Product(pid);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//return xyz.toString();
		System.out.println(product_Manufacturer.toString());
		Product product = new Product(pid,product_Name.toString(),product_Manufacturer.toString(),product_Price,product_Quantity );
		return product;
	}
	
}
