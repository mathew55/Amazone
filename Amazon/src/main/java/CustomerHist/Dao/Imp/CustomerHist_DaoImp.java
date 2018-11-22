package CustomerHist.Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import CustomerHist.DaoI.CustomerDao_Interface;
import agile.TeamA.utils.Dbmanage;
import model.CustomerHist;

public class CustomerHist_DaoImp implements CustomerDao_Interface{

	@Override
	public ArrayList<CustomerHist> GetCustomerhistlist() {
		 Dbmanage dbmanage = new Dbmanage();
		 Connection conn = null;
		System.out.println("finish link to database and start seraching");
		ArrayList<CustomerHist> CustomerHistlist= new ArrayList<>();
		
		try {
			conn = dbmanage.initDB();
			// String sql = "SELECT * FROM DATABASE WHERE admin_username="+AdminName+";";
			String sql="SELECT customer_firstName,customer_lastName,product_Name,product_Price,product_Quantity FROM CUSTOMERS c,Customer_Hist ch WHERE c.customer_ID=ch.customer_ID";
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				CustomerHist ch=new CustomerHist();
				System.out.println("start add elements to list");
				ch.setcustomerfirstname(rs.getString("customer_firstName"));
				ch.setcustomerlastname(rs.getString("customer_lastName"));
				ch.setproductName(rs.getString("product_Name"));
				ch.setproductPrice(rs.getBigDecimal("product_Price"));
				ch.setproductQuantity(rs.getInt("product_Quantity"));
				System.out.println("firstname is "+rs.getString("customer_firstName"));
				System.out.println("lastName is "+rs.getString("customer_lastName"));
				System.out.println("product_Name is "+rs.getString("product_Name"));
				System.out.println("product_Price is "+rs.getBigDecimal("product_Price"));
				System.out.println("product_Quantity is "+rs.getInt("product_Quantity"));
				CustomerHistlist.add(ch);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.err.println("get hist information have problem");
	}
		return CustomerHistlist;
}
}