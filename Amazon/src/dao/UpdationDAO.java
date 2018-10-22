package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Product;

public enum UpdationDAO {
	
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
	
	public int UpdateDB(int qty,int pid1) {
		Connection connection = getConnection();
		int flag = 0;
		try {
			//UPDATE `table_name` SET `column_name` = `new_value' [WHERE condition];
			PreparedStatement psmt = connection
					.prepareStatement("UPDATE products set product_Quantity_Available = ? where product_ID = ?");
			psmt.setInt(1, qty);
			psmt.setInt(2, pid1);
			flag =psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 1;
	}

}
