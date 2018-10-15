package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Name;

public enum NameDAO {
	
	instance;
	
	public Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/amazone", "root", "admin");
			
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
	
	//public Name checkFirstName(String name) {
	public void checkFirstName(int pid) {
		Connection connection = getConnection();
//		Name A_Name = null;
		
		try {
			PreparedStatement psmt = connection
					.prepareStatement("SELECT * FROM products WHERE product_ID = ?");
			psmt.setInt(1, pid);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
		//		A_Name = new Name(rs.getString("firstname"));
				System.out.println("name " +pid+ " is in the data base.");				
			}
			else {
				System.out.println("name " +pid+ " is not in the data base");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	//	return A_Name;
	}

}
