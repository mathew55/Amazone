package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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

	
	public ArrayList<SearchProduct> getSearchedParameter(String keyword)
	{
		
		ArrayList<SearchProduct> productsSearch = new ArrayList<>();
		
		
		//ArrayList<SearchProduct> search = null;
		//ArrayList pid_list = new ArrayList();
		
		try {
			Connection connection = getConnection();
			//if(keyword!=null && !keyword.equals("")){
				System.out.println("Keyword " + keyword +" posted to database.");
			
			//PreparedStatement psmt = connection.prepareStatement("SELECT * FROM products WHERE product_Name= ?");
			PreparedStatement psmt = connection.prepareStatement("SELECT * FROM products WHERE  product_Name LIKE '%"+keyword+"%'");
			System.out.println("Keyword " + psmt +" posted to database.");
			ResultSet res = psmt.executeQuery();
			
			SearchProduct search;
				//search = new ArrayList<SearchProduct>(res.getString("keyword"));
			
				//SearchProduct searchpd = new SearchProduct(keyword);
				
				// psmt = keyword;
				//while (res.next()) {
					//searchpd.setProductName(res.getString("product_Name"));
					//search = new ArrayList();

	                //search.add(res.getString("product_Name"));
	                //al.add(rs.getString(2));
	               // al.add(rs.getString(3));
	               // al.add(rs.getString(4));
	                //System.out.println("search :: " + search);
	                //pid_list.add(search);
				
			 
				 while(res.next()) {
					 search = new SearchProduct(
		                       res.getString("product_Name")
		                      
		                        
		                );
					 
		              productsSearch.add(search);
				
	            }
				
			//}
			
	
			System.out.println("Searched " + productsSearch +" from the database.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productsSearch;	
	}
	
}



