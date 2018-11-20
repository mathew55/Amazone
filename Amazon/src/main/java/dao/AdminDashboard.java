package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.DashboardProduct;
public class AdminDashboard {

	//public enum AdminDashboard {
	//instance;
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

	public int getTotalProduct()  {

	Connection connection = getConnection();
	 int value= 0;														
	try {
	 PreparedStatement statement =  connection.prepareStatement("select count(*) as total_record FROM `PRODUCTS`");
     ResultSet result = statement.executeQuery();
     result.next();
     String sum = result.getString(1);
     System.out.println(sum);
     value = Integer.parseInt(sum);
     //value = Double.parseDouble(sum);

    } catch(Exception exc){
        System.out.println(exc.getMessage());
    }
	   System.out.println(value);
    	return value;
    	
	}
	
	
	public int getProductLessThan3() {

		Connection connection = getConnection();
		 int value= 0;														
		try {
		 PreparedStatement statement =  connection.prepareStatement("SELECT count( * ) as total_record FROM `PRODUCTS` where product_Quantity_Available < 3");
	     ResultSet result = statement.executeQuery();
	     result.next();
	     String sumProductLess = result.getString(1);
	     System.out.println(sumProductLess);
	     value = Integer.parseInt(sumProductLess);
	     //value = Double.parseDouble(sum);

	    } catch(Exception exc){
	        System.out.println(exc.getMessage());
	    }
		   System.out.println(value);
	    	return value;
	    	
		}
	
	public ArrayList getListofFewProduct()  {

		ArrayList<DashboardProduct> ar = new ArrayList<>();
		Connection connection = getConnection();
		
		try {
		 PreparedStatement statement =  connection.prepareStatement("SELECT * from PRODUCTS order by product_ID desc limit 7");
	    
		 ResultSet res = statement.executeQuery();

         while(res.next())
         {
        	 DashboardProduct dashProd = new DashboardProduct();
        	 dashProd.setProductName(res.getString("product_Name"));
        	 dashProd.setProductPrice(res.getDouble("product_Price"));
        	 dashProd.setProductQuantity(res.getInt("product_Quantity_Available"));
        	 dashProd.setProductManufacturer(res.getString("product_Manufacturer"));
        	 
          ar.add(dashProd);
          
        }
     } catch (Exception e) {
         e.printStackTrace(System.err);
     } 
		System.out.println(ar);
     return ar;
		}
}
